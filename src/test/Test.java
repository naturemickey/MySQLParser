package test;

import java.nio.file.Files;
import java.nio.file.Paths;

import net.yeah.zhouyou.mickey.mysql.MySQLParserUtils;

public class Test {

	public static void main(String[] args) throws Exception {
		Files.lines(Paths.get("sqls.txt")).forEach(sql -> {
			System.out.println("before: " + sql);
			System.out.println("after : " + MySQLParserUtils.addVersionToSql(sql, "2"));
		});
	}

}

