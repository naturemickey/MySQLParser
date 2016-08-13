package test;

import java.io.ByteArrayInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLLexer;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLParser;

public class TestTree {

	public static void main(String[] args) throws Exception {

		String sql = "select * from tab where a = Null and b = 'a'";
		try (ByteArrayInputStream is = new ByteArrayInputStream(sql.getBytes());) {
			ANTLRInputStream input = new ANTLRInputStream(is);
			MySQLLexer lexer = new MySQLLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			MySQLParser parser = new MySQLParser(tokens);
			ParseTree tree = parser.stat();
            System.out.println(tree.toStringTree(parser));
		}

	}

}
