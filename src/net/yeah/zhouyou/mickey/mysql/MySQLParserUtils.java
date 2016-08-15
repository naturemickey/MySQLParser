package net.yeah.zhouyou.mickey.mysql;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLLexer;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLParser;
import net.yeah.zhouyou.mickey.mysql.tree.ColumnNamesNode;
import net.yeah.zhouyou.mickey.mysql.tree.DeleteNode;
import net.yeah.zhouyou.mickey.mysql.tree.ElementTextNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionRelationalNode;
import net.yeah.zhouyou.mickey.mysql.tree.InsertNode;
import net.yeah.zhouyou.mickey.mysql.tree.SQLSyntaxTreeNode;
import net.yeah.zhouyou.mickey.mysql.tree.SelectExprsNode;
import net.yeah.zhouyou.mickey.mysql.tree.SelectNode;
import net.yeah.zhouyou.mickey.mysql.tree.SetExprNode;
import net.yeah.zhouyou.mickey.mysql.tree.SetExprsNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableNameAndAliasNode;
import net.yeah.zhouyou.mickey.mysql.tree.TablesNode;
import net.yeah.zhouyou.mickey.mysql.tree.UpdateMultipleTableNode;
import net.yeah.zhouyou.mickey.mysql.tree.UpdateNode;
import net.yeah.zhouyou.mickey.mysql.tree.UpdateSignleTableNode;
import net.yeah.zhouyou.mickey.mysql.tree.ValueListNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionOpNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionSubNode;

public class MySQLParserUtils {

	private static final String CULUMN_NAME = "data_env_version";
	private static final Cache<Key, String> addVersionCache = CacheBuilder.newBuilder().maximumSize(100000).build();

	public static String addVersionToSql(String sql, String version) {
		try {
			Key key = new Key(sql, version);
			return addVersionCache.get(key, () -> {
				return addVersionToSqlNoCache(key.sql, key.version);
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static String addVersionToSqlNoCache(String sql, String version) {
		SQLSyntaxTreeNode node = parse(sql);
		addColumn(node, version);
		return node.toString();
	}

	private static class Key {
		String sql;
		String version;

		public Key(String sql, String version) {
			this.sql = sql;
			this.version = version;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((sql == null) ? 0 : sql.hashCode());
			result = prime * result + ((version == null) ? 0 : version.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Key other = (Key) obj;
			if (sql == null) {
				if (other.sql != null)
					return false;
			} else if (!sql.equals(other.sql))
				return false;
			if (version == null) {
				if (other.version != null)
					return false;
			} else if (!version.equals(other.version))
				return false;
			return true;
		}
	}

	public static SQLSyntaxTreeNode parse(String sql) {
		try (ByteArrayInputStream is = new ByteArrayInputStream(sql.getBytes());) {
			ANTLRInputStream input = new ANTLRInputStream(is);
			MySQLLexer lexer = new MySQLLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			MySQLParser parser = new MySQLParser(tokens);
			ParseTree tree = parser.stat();

			return new MySQLVisitorImpl().visit(tree);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static SQLSyntaxTreeNode addColumn(SQLSyntaxTreeNode node, String version) {
		if (!(node instanceof SQLSyntaxTreeNode))
			return node;
		if (node instanceof SelectNode) {
			node = processSelect(node, version);
		} else if (node instanceof UpdateNode) {
			node = processUpdate(node, version);
		} else if (node instanceof InsertNode) {
			node = processInsert(node, version);
		} else if (node instanceof DeleteNode) {
			node = processDelete(node, version);
		}

		for (Field f : node.getClass().getDeclaredFields()) {
			f.setAccessible(true);
			try {
				Object o = f.get(node);
				if (o instanceof SQLSyntaxTreeNode)
					addColumn((SQLSyntaxTreeNode) o, version);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}

		return node;
	}

	private static SQLSyntaxTreeNode processDelete(SQLSyntaxTreeNode node, String version) {
		DeleteNode delete = (DeleteNode) node;
		if (TableConfig.isVersionTable(delete.getTableNameAndAlias().getName())) {
			String alias = delete.getTableNameAndAlias().getAlias();
			WhereConditionNode wc = delete.getWhereCondition();

			String left = alias == null ? CULUMN_NAME : alias + '.' + CULUMN_NAME;
			ExpressionRelationalNode ern = new ExpressionRelationalNode(new ElementTextNode(left), new ElementTextNode(version), "<=");
			WhereConditionNode newWc = null;
			if (wc == null) {
				newWc = new WhereConditionOpNode(ern, null, null);
			} else {
				newWc = new WhereConditionOpNode(ern, "and", new WhereConditionSubNode(wc));
			}
			delete.setWhereCondition(newWc);
		}

		return delete;
	}

	private static SQLSyntaxTreeNode processInsert(SQLSyntaxTreeNode node, String version) {
		InsertNode insert = (InsertNode) node;
		if (TableConfig.isVersionTable(insert.getTableName())) {
			// 如果columnNames为空则后无法添加属性，所以这里不对空做判断，直接报错。
			ColumnNamesNode columnNames = insert.getColumnNames().getLastNode();
			columnNames.setSuffix(new ColumnNamesNode(CULUMN_NAME, null));

			ValueListNode valueName = insert.getValueNames();
			SelectNode select = insert.getSelect();
			if (valueName != null) {
				valueName = valueName.getLastNode();
				valueName.setSuffix(new ValueListNode(version, null));
			} else {
				SelectExprsNode selectExprNode = select.getSelectExprs().getLastNode();
				selectExprNode.setSuffix(new SelectExprsNode(new ElementTextNode(version), null, null));
			}
		}

		return insert;
	}

	private static SQLSyntaxTreeNode processUpdate(SQLSyntaxTreeNode node, String version) {
		if (node instanceof UpdateSignleTableNode) {
			UpdateSignleTableNode update = (UpdateSignleTableNode) node;
			if (TableConfig.isVersionTable(update.getTableNameAndAlias().getName())) {
				String alias = update.getTableNameAndAlias().getAlias();
				WhereConditionNode wc = update.getWhereCondition();
				SetExprsNode setExprs = update.getSetExprs().getLastNode();
				SetExprNode addSetNode = new SetExprNode(new ElementTextNode(CULUMN_NAME), new ElementTextNode(version));
				setExprs.setSuffix(new SetExprsNode(addSetNode, null));

				ExpressionRelationalNode ern = new ExpressionRelationalNode(new ElementTextNode(alias == null ? CULUMN_NAME : alias + '.' + CULUMN_NAME),
						new ElementTextNode(version), "<=");
				WhereConditionNode newWc = null;
				if (wc == null) {
					newWc = new WhereConditionOpNode(ern, null, null);
				} else {
					newWc = new WhereConditionOpNode(ern, "and", new WhereConditionSubNode(wc));
				}
				update.setWhereCondition(newWc);
			}
		} else {
			UpdateMultipleTableNode update = (UpdateMultipleTableNode) node;

			List<TableNameAndAliasNode> tabs = update.getTableNameAndAliases().all();
			WhereConditionNode wc = update.getWhereCondition();
			SetExprsNode lastSetExprs = update.getSetExprs().getLastNode();

			WhereConditionOpNode versionCond = null;

			Collections.reverse(tabs);
			for (TableNameAndAliasNode tab : tabs) {
				String tabName = tab.getName();
				if (TableConfig.isVersionTable(tabName)) {
					String alias = tab.getAlias();
					String cn = (alias == null ? tabName : alias) + '.' + CULUMN_NAME;

					// process where
					ExpressionRelationalNode ern = new ExpressionRelationalNode(new ElementTextNode(cn), new ElementTextNode(version), "<=");
					versionCond = new WhereConditionOpNode(ern, "and", versionCond);

					// process set
					SetExprNode addSetNode = new SetExprNode(new ElementTextNode(cn), new ElementTextNode(version));
					lastSetExprs.setSuffix(new SetExprsNode(addSetNode, null));
					lastSetExprs = lastSetExprs.getSuffix();
				}
			}

			if (versionCond != null) {
				if (wc != null) {
					versionCond.appendCondition("and", new WhereConditionSubNode(wc));
				}

				update.setWhereCondition(versionCond);
			}
		}
		return node;
	}

	private static SQLSyntaxTreeNode processSelect(SQLSyntaxTreeNode node, String version) {
		SelectNode select = (SelectNode) node;

		TablesNode tables = select.getTables();

		if (tables == null) {
			return node;
		}

		List<TableNameAndAliasNode> tabs = tables.getRealTables();
		WhereConditionNode wc = select.getWhere();

		WhereConditionOpNode versionCond = null;

		Collections.reverse(tabs);
		for (TableNameAndAliasNode tab : tabs) {
			String tabName = tab.getName();
			if (TableConfig.isVersionTable(tabName)) {
				String alias = tab.getAlias();
				String cn = alias == null ? tabName : alias;
				ExpressionRelationalNode ern = new ExpressionRelationalNode(new ElementTextNode(cn + '.' + CULUMN_NAME), new ElementTextNode(version), "<=");
				versionCond = new WhereConditionOpNode(ern, "and", versionCond);
			}
		}

		if (versionCond != null) {
			if (wc != null) {
				versionCond.appendCondition("and", new WhereConditionSubNode(wc));
			}

			select.setWhere(versionCond);
		}
		return select;
	}
}
