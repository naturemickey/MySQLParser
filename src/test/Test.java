package test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws Exception {
		Files.lines(Paths.get("sqls.txt")).forEach(SqlTestUtils::test);
	}

}
