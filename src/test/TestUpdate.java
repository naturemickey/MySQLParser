package test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import net.yeah.zhouyou.mickey.mysql.MySQLVisitorImpl;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLLexer;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLParser;
import net.yeah.zhouyou.mickey.mysql.tree.ElementNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionRelationalNode;
import net.yeah.zhouyou.mickey.mysql.tree.SQLSyntaxTreeNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableNameAndAliasNode;
import net.yeah.zhouyou.mickey.mysql.tree.UpdateMultipleTableNode;
import net.yeah.zhouyou.mickey.mysql.tree.UpdateSignleTableNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionOpNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionSubNode;

public class TestUpdate {
	public static void main(String[] args) throws Exception {

		for (String sql : new String[] { "update tab x set x.a=?,x.b='a' where id=?", "update tab set a = ?",
				"update tab1 t1, tab2 set t1.a = ?, b='a' where x=? and y=?" }) {
			fun(sql);
		}

	}

	private static void fun(String sql) throws IOException {
		try (ByteArrayInputStream is = new ByteArrayInputStream(sql.getBytes());) {
			ANTLRInputStream input = new ANTLRInputStream(is);
			MySQLLexer lexer = new MySQLLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			MySQLParser parser = new MySQLParser(tokens);
			ParseTree tree = parser.stat();

			SQLSyntaxTreeNode node = new MySQLVisitorImpl().visit(tree);

			System.out.println(node);

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

				System.out.println(update);
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
				
				System.out.println(update);
			}
		}
	}
}
