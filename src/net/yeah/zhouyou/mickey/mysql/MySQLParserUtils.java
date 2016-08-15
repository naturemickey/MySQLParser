package net.yeah.zhouyou.mickey.mysql;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLLexer;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLParser;
import net.yeah.zhouyou.mickey.mysql.tree.ColumnNamesNode;
import net.yeah.zhouyou.mickey.mysql.tree.DeleteNode;
import net.yeah.zhouyou.mickey.mysql.tree.ElementNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionRelationalNode;
import net.yeah.zhouyou.mickey.mysql.tree.InsertNode;
import net.yeah.zhouyou.mickey.mysql.tree.SQLSyntaxTreeNode;
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
	private static final Map<Key, String> addVersionCache = new ConcurrentHashMap<>();
	private static final int cacheCountLimit = 1000000;

	public static String addVersionToSql(String sql, String version) {
		if (addVersionCache.size() < cacheCountLimit) {
			return addVersionCache.computeIfAbsent(new Key(sql, version), key -> {
				return addVersionToSqlNoCache(key.sql, key.version);
			});
		} else {
			String res = addVersionCache.get(new Key(sql, version));
			return (res != null) ? res : addVersionToSqlNoCache(sql, version);
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
		String alias = delete.getTableNameAndAlias().getAlias();
		WhereConditionNode wc = delete.getWhereCondition();

		String left = alias == null ? CULUMN_NAME : alias + '.' + CULUMN_NAME;
		ExpressionRelationalNode ern = new ExpressionRelationalNode(new ElementNode(left), new ElementNode(version), "<=");
		WhereConditionNode newWc = null;
		if (wc == null) {
			newWc = new WhereConditionOpNode(ern, null, null);
		} else {
			newWc = new WhereConditionOpNode(ern, "and", new WhereConditionSubNode(wc));
		}
		delete.setWhereCondition(newWc);

		return delete;
	}

	private static SQLSyntaxTreeNode processInsert(SQLSyntaxTreeNode node, String version) {
		InsertNode insert = (InsertNode) node;
		ColumnNamesNode columnNames = insert.getColumnNames();
		while (columnNames.getSuffix() != null) {
			columnNames = columnNames.getSuffix();
		}
		columnNames.setSuffix(new ColumnNamesNode(CULUMN_NAME, null));

		ValueListNode valueName = insert.getValueNames();
		while (valueName.getSuffix() != null) {
			valueName = valueName.getSuffix();
		}
		valueName.setSuffix(new ValueListNode(version, null));
		return insert;
	}

	private static SQLSyntaxTreeNode processUpdate(SQLSyntaxTreeNode node, String version) {
		if (node instanceof UpdateSignleTableNode) {
			UpdateSignleTableNode update = (UpdateSignleTableNode) node;

			String alias = update.getTableNameAndAlias().getAlias();
			WhereConditionNode wc = update.getWhereCondition();
			SetExprsNode setExprs = update.getSetExprs().getLastNode();
			SetExprNode addSetNode = new SetExprNode(new ElementNode(CULUMN_NAME), new ElementNode(version));
			setExprs.setSuffix(new SetExprsNode(addSetNode, null));

			ExpressionRelationalNode ern = new ExpressionRelationalNode(new ElementNode(alias == null ? CULUMN_NAME : alias + '.' + CULUMN_NAME),
					new ElementNode(version), "<=");
			WhereConditionNode newWc = null;
			if (wc == null) {
				newWc = new WhereConditionOpNode(ern, null, null);
			} else {
				newWc = new WhereConditionOpNode(ern, "and", new WhereConditionSubNode(wc));
			}
			update.setWhereCondition(newWc);
		} else {
			UpdateMultipleTableNode update = (UpdateMultipleTableNode) node;

			List<TableNameAndAliasNode> tabs = update.getTableNameAndAliases().all();
			WhereConditionNode wc = update.getWhereCondition();
			SetExprsNode lastSetExprs = update.getSetExprs().getLastNode();

			WhereConditionOpNode versionCond = null;

			Collections.reverse(tabs);
			for (TableNameAndAliasNode tab : tabs) {
				String tabName = tab.getName();
				String alias = tab.getAlias();
				String cn = (alias == null ? tabName : alias) + '.' + CULUMN_NAME;

				// process where
				ExpressionRelationalNode ern = new ExpressionRelationalNode(new ElementNode(cn), new ElementNode(version), "<=");
				versionCond = new WhereConditionOpNode(ern, "and", versionCond);

				// process set
				SetExprNode addSetNode = new SetExprNode(new ElementNode(cn), new ElementNode(version));
				lastSetExprs.setSuffix(new SetExprsNode(addSetNode, null));
				lastSetExprs = lastSetExprs.getSuffix();
			}

			if (wc != null) {
				versionCond.appendCondition("and", new WhereConditionSubNode(wc));
			}

			update.setWhereCondition(versionCond);
		}
		return node;
	}

	private static SQLSyntaxTreeNode processSelect(SQLSyntaxTreeNode node, String version) {
		SelectNode select = (SelectNode) node;

		TablesNode tables = select.getTables();
		List<TableNameAndAliasNode> tabs = tables.getRealTables();
		WhereConditionNode wc = select.getWhere();

		WhereConditionOpNode versionCond = null;

		Collections.reverse(tabs);
		for (TableNameAndAliasNode tab : tabs) {
			String tabName = tab.getName();
			String alias = tab.getAlias();
			String cn = alias == null ? tabName : alias;
			ExpressionRelationalNode ern = new ExpressionRelationalNode(new ElementNode(cn + '.' + CULUMN_NAME), new ElementNode(version), "<=");
			versionCond = new WhereConditionOpNode(ern, "and", versionCond);
		}

		if (wc != null) {
			versionCond.appendCondition("and", new WhereConditionSubNode(wc));
		}

		select.setWhere(versionCond);
		return select;
	}
}
