package test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import net.yeah.zhouyou.mickey.mysql.MySQLVisitorImpl;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLLexer;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLParser;
import net.yeah.zhouyou.mickey.mysql.tree.DeleteNode;
import net.yeah.zhouyou.mickey.mysql.tree.ElementNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionRelationalNode;
import net.yeah.zhouyou.mickey.mysql.tree.SQLSyntaxTreeNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionOpNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionSubNode;

public class TestDelete {
	public static void main(String[] args) throws Exception {

		for (String sql : new String[] { "delete from tt_order_status where id = ?", "delete from tt_order_status t where t.id = ?",
				"delete from tt_order_status t" }) {
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

			DeleteNode delete = (DeleteNode) node;
			String alias = delete.getTableNameAndAlias().getAlias();
			WhereConditionNode wc = delete.getWhereCondition();

			ExpressionRelationalNode ern = new ExpressionRelationalNode(new ElementNode(alias == null ? "data_env_version" : alias + '.' + "data_env_version"),
					new ElementNode("'v1'"), "=");
			WhereConditionNode newWc = null;
			if (wc == null) {
				newWc = new WhereConditionOpNode(ern, null, null);
			} else {
				newWc = new WhereConditionOpNode(ern, "and", new WhereConditionSubNode(wc));
			}
			delete.setWhereCondition(newWc);

			System.out.println(delete);
		}
	}
}
