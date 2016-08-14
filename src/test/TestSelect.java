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
import net.yeah.zhouyou.mickey.mysql.tree.SelectNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableNameAndAliasNode;
import net.yeah.zhouyou.mickey.mysql.tree.TablesNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionOpNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionSubNode;

public class TestSelect {
	public static void main(String[] args) throws Exception {

		for (String sql : new String[] {
				"select this_.id as id1_14_0_, this_.bind_opr_desc as bind_opr2_14_0_, this_.bind_opr_result as bind_opr3_14_0_, this_.bind_tm as bind_tm4_14_0_, this_.create_tm as create_t5_14_0_, this_.dest_number as dest_num6_14_0_, this_.dest_origin_number as dest_ori7_14_0_, this_.is_valid as is_valid8_14_0_, this_.reserved_bind_tm as reserved9_14_0_, this_.reserved_unbind_tm as reserve10_14_0_, this_.src_number as src_num11_14_0_, this_.src_origin_number as src_ori12_14_0_, this_.task_id as task_id13_14_0_, this_.unbind_opr_desc as unbind_14_14_0_, this_.unbind_opr_result as unbind_15_14_0_, this_.unbind_tm as unbind_16_14_0_, this_.virt_number as virt_nu17_14_0_ from tt_number_bind this_ where this_.task_id=?",
				"select a, b from tab1, tab2 t where x = y", //
				"select a, b from ta left outer join tb on x = y" //
		}) {
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
			System.out.println(select);
		}
	}
}
