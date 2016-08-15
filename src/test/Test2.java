package test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import net.yeah.zhouyou.mickey.mysql.MySQLParserUtils;

public class Test2 {

	public static void main(String[] args) throws Exception {
		List<String> lines = Files.readAllLines(Paths.get("sqls.txt"));
		int len = lines.size();
		int c = 10000;
		System.out.println(len);

		for (String sql : lines) {
			MySQLParserUtils.addVersionToSql(sql, "2");
		}

		long start = System.currentTimeMillis();
		for (int i = 0; i < c; ++i) {
			for (String sql : lines) {
				MySQLParserUtils.addVersionToSqlNoCache(sql, "2");
			}
		}
		long time = System.currentTimeMillis() - start;
		System.out.println(time);
		System.out.println((c * len * 1D) / time);

		start = System.currentTimeMillis();
		for (int i = 0; i < c; ++i) {
			for (String sql : lines) {
				MySQLParserUtils.addVersionToSql(sql, "2");
			}
		}
		time = System.currentTimeMillis() - start;
		System.out.println(time);
		System.out.println((c * len * 1D) / time);
	}

}
