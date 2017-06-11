package test;

import net.yeah.zhouyou.mickey.mysql.MySQLParserUtils;

public class Test {

	public static void main(String[] args) throws Exception {
		//Files.lines(Paths.get("sqls.txt")).forEach(SqlTestUtils::test);
        String sql = MySQLParserUtils.addVersionToSql("select * from test limit 5 offset 10", "1");
        System.out.println(sql);
	}

}
