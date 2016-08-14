package test;

import net.yeah.zhouyou.mickey.mysql.MySQLParserUtils;

public class SqlTestUtils {

	public static void test(String sql) {
		System.out.println(sql);
		System.out.println(MySQLParserUtils.addVersionToSql(sql, "5"));
	}

}
