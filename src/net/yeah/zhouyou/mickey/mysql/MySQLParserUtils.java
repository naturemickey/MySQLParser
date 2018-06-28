package net.yeah.zhouyou.mickey.mysql;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLLexer;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLParser;
import net.yeah.zhouyou.mickey.mysql.tree.DeleteNode;
import net.yeah.zhouyou.mickey.mysql.tree.ElementDateNode;
import net.yeah.zhouyou.mickey.mysql.tree.ElementTextNode;
import net.yeah.zhouyou.mickey.mysql.tree.ElementTextParamNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionIsOrIsNotNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionRelationalNode;
import net.yeah.zhouyou.mickey.mysql.tree.InsertNode;
import net.yeah.zhouyou.mickey.mysql.tree.SQLSyntaxTreeNode;
import net.yeah.zhouyou.mickey.mysql.tree.SelectExprsNode;
import net.yeah.zhouyou.mickey.mysql.tree.SelectNode;
import net.yeah.zhouyou.mickey.mysql.tree.SelectSuffixNode;
import net.yeah.zhouyou.mickey.mysql.tree.SetExprNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableNameAndAliasNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableRelNode;
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
	private static final Map<String, String> placeHolderingCache = new ConcurrentHashMap<>();
	private static final Map<String, List<List<Object>>> hardCodeCache = new ConcurrentHashMap<>();

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

	public static String placeHoldering(String sql) {
		SQLSyntaxTreeNode node = parse(sql);
		List<Object> hardCode = new ArrayList<>();
		placeHoldering(node, hardCode);
		return node.toString();
	}

	public static String placeHolderingNoCache(String sql) {
		SQLSyntaxTreeNode node = parse(sql);
		placeHoldering(node, new ArrayList<>());
		return node.toString();
	}

	private static void placeHoldering(SQLSyntaxTreeNode node, List<Object> hardCode) {
		Map<Field, SQLSyntaxTreeNode> map = node.childrenNode();
		map.forEach((field, n) -> {
			if (n == null)
				return;
			if (n instanceof ElementTextParamNode || n instanceof ElementDateNode) {
				hardCode.add(n);
				try {
					field.set(node, new ElementTextNode("?"));
				} catch (IllegalArgumentException | IllegalAccessException e) {
					throw new RuntimeException();
				}
			} else if (n instanceof SelectSuffixNode) {
				SelectSuffixNode sn = (SelectSuffixNode) n;
				if (sn.getRowCount() != null && !sn.getRowCount().equals("?")) {
					hardCode.add(sn.getRowCount());
					sn.setRowCount("?");
					if (sn.getOffset() != null && !sn.getRowCount().equals("?")) {
						hardCode.add(sn.getOffset());
						sn.setOffset("?");
					}
				}
			} else {
				placeHoldering(n, hardCode);
			}
		});
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
			parser.setErrorHandler(new MySQLParserErrorStrategy());
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
			insert.getColumnNames().addColumn(CULUMN_NAME);

			ValueListNode valueName = insert.getValueNames();
			SelectNode select = insert.getSelect();
			if (valueName != null) {
				valueName.addElementNode(new ElementTextNode(version));
			} else {
				SelectExprsNode selectExprNode = select.getSelectInner().getPrefix().getSelectExprs().getLastNode();
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
				SetExprNode addSetNode = new SetExprNode(new ElementTextNode(CULUMN_NAME), new ElementTextNode(version));
				update.getSetExprs().addSetExpr(addSetNode);

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

			WhereConditionNode versionCond = null;

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
					update.getSetExprs().addSetExpr(addSetNode);
				}
			}

			if (versionCond != null) {
				if (wc != null) {
//					versionCond.appendCondition("and", new WhereConditionSubNode(wc));
					versionCond = new WhereConditionSubNode(versionCond, "and", new WhereConditionSubNode(wc));
				}

				update.setWhereCondition(versionCond);
			}
		}
		return node;
	}

	private static SQLSyntaxTreeNode processSelect(SQLSyntaxTreeNode node, String version) {
		SelectNode select = (SelectNode) node;

		TablesNode tables = select.getSelectInner().getPrefix().getTables();

		if (tables == null) {
			return node;
		}

		List<TableRelNode.TableAndJoinMod> tabs = tables.getRealTables();
		WhereConditionNode wc = select.getSelectInner().getPrefix().getWhere();

		WhereConditionNode versionCond = null;
		String preTableJoinMod = null;

		Collections.reverse(tabs);
		for (TableRelNode.TableAndJoinMod tabAndJoinMod : tabs) {
			TableNameAndAliasNode tab = tabAndJoinMod.getTableNameAndAliasNode();
			String curTableJoinMod = tabAndJoinMod.getTableJoinMod();
			// tableA left outer join tableB right outer join tableC left outer join tableD
			String tabName = tab.getName();
			if (TableConfig.isVersionTable(tabName)) {
				String alias = tab.getAlias();
				String cn = alias == null ? tabName : alias;
				ExpressionNode ern = new ExpressionRelationalNode(new ElementTextNode(cn + '.' + CULUMN_NAME), new ElementTextNode(version), "<=");
				ExpressionIsOrIsNotNode nullNode = null;
				if (curTableJoinMod != null && curTableJoinMod.length() > 0) {
					if (curTableJoinMod.startsWith("left")) {
						nullNode = new ExpressionIsOrIsNotNode(new ElementTextNode(cn + '.' + CULUMN_NAME), false, "null");
					}
				} else if (preTableJoinMod != null && preTableJoinMod.length() > 0) {
					if (preTableJoinMod.startsWith("right")) {
						nullNode = new ExpressionIsOrIsNotNode(new ElementTextNode(cn + '.' + CULUMN_NAME), false, "null");
					}
				}
				if (nullNode != null) {
					versionCond = new WhereConditionSubNode(new WhereConditionOpNode(ern, "or", new WhereConditionOpNode(nullNode, null, null)), "and", versionCond);
				} else {
					versionCond = new WhereConditionOpNode(ern, "and", versionCond);
				}
			}

			preTableJoinMod = curTableJoinMod;
		}

		if (versionCond != null) {
			if (wc != null) {
//				if (versionCond instanceof WhereConditionOpNode) {
//					((WhereConditionOpNode) versionCond).appendCondition("and", new WhereConditionSubNode(wc));
//				} else {
					versionCond = new WhereConditionSubNode(versionCond, "and", new WhereConditionSubNode(wc));
//				}
			}

			select.getSelectInner().getPrefix().setWhere(versionCond);
		}
		return select;
	}
}
