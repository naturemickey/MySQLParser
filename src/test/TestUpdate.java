package test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import net.yeah.zhouyou.mickey.mysql.MySQLVisitorImpl;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLLexer;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLParser;
import net.yeah.zhouyou.mickey.mysql.tree.SQLSyntaxTreeNode;
import net.yeah.zhouyou.mickey.mysql.tree.UpdateMultipleTableNode;
import net.yeah.zhouyou.mickey.mysql.tree.UpdateSignleTableNode;

public class TestUpdate {
	public static void main(String[] args) throws Exception {

		for (String sql : new String[] { "update tab x set x.a=?,x.b='a' where id=?" }) {
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

				System.out.println(update);
			} else {
				UpdateMultipleTableNode update = (UpdateMultipleTableNode) node;

				System.out.println(update);
			}
		}
	}
}
