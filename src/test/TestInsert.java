package test;

import java.io.ByteArrayInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import net.yeah.zhouyou.mickey.mysql.MySQLVisitorImpl;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLLexer;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLParser;
import net.yeah.zhouyou.mickey.mysql.tree.ColumnNamesNode;
import net.yeah.zhouyou.mickey.mysql.tree.InsertNode;
import net.yeah.zhouyou.mickey.mysql.tree.SQLSyntaxTreeNode;
import net.yeah.zhouyou.mickey.mysql.tree.ValueListNode;

public class TestInsert {
	public static void main(String[] args) throws Exception {

		String sql = "InSeRt taba(abc_1,str_c, create_tiMe,n,ph1,ph2) VALUES(?,'abc',current_timestamp,nUlL,:1,:ph2)";
		try (ByteArrayInputStream is = new ByteArrayInputStream(sql.getBytes());) {
			ANTLRInputStream input = new ANTLRInputStream(is);
			MySQLLexer lexer = new MySQLLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			MySQLParser parser = new MySQLParser(tokens);
			ParseTree tree = parser.stat();

			SQLSyntaxTreeNode node = new MySQLVisitorImpl().visit(tree);

			System.out.println(node);

			InsertNode insert = (InsertNode) node;
			ColumnNamesNode columnNames = insert.getColumnNames();
			while (columnNames.getSuffix() != null) {
				columnNames = columnNames.getSuffix();
			}
			columnNames.setSuffix(new ColumnNamesNode("data_version", null));

			ValueListNode valueName = insert.getValueNames();
			while (valueName.getSuffix() != null) {
				valueName = valueName.getSuffix();
			}
			valueName.setSuffix(new ValueListNode("'v1'", null));

			System.out.println(node);
		}

	}
}
