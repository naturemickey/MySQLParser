package net.yeah.zhouyou.mickey.mysql;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

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

	public static String addVersionToSql(String sql, String version) {
		SQLSyntaxTreeNode node = parse(sql);
		addColumn(node, version);
		return node.toString();
	}

	private static SQLSyntaxTreeNode addColumn(SQLSyntaxTreeNode node, String version) {
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

			TableNameAndAliasNode tableNameAndAlias = update.getTableNameAndAlias();
			String tabName = tableNameAndAlias.getName();
			String alias = tableNameAndAlias.getAlias();
			WhereConditionNode wc = update.getWhereCondition();

			ExpressionRelationalNode ern = new ExpressionRelationalNode(new ElementNode(alias == null ? "data_env_version" : alias + ".data_env_version"),
					new ElementNode("'v1'"), "<=");
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

			WhereConditionOpNode versionCond = null;

			Collections.reverse(tabs);
			for (TableNameAndAliasNode tab : tabs) {
				String tabName = tab.getName();
				String alias = tab.getAlias();
				String cn = alias == null ? tabName : alias;
				ExpressionRelationalNode ern = new ExpressionRelationalNode(new ElementNode(cn + ".data_env_version"), new ElementNode("'v1'"), "<=");
				versionCond = new WhereConditionOpNode(ern, "and", versionCond);
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
			ExpressionRelationalNode ern = new ExpressionRelationalNode(new ElementNode(cn + ".data_env_version"), new ElementNode("'v1'"), "<=");
			versionCond = new WhereConditionOpNode(ern, "and", versionCond);
		}

		if (wc != null) {
			versionCond.appendCondition("and", new WhereConditionSubNode(wc));
		}

		select.setWhere(versionCond);
		return select;
	}
}
