package test;

import net.yeah.zhouyou.mickey.mysql.MySQLParserUtils;

public class SqlTestUtils {

	public static void test(String sql) {
		System.out.println("before  : "+sql);
		System.out.println("after   : "+MySQLParserUtils.addVersionToSql(sql, "5"));
		System.out.println("replace : " + MySQLParserUtils.placeHoldering(sql));
		System.out.println();
	}

}
