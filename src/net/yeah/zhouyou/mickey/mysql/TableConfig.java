package net.yeah.zhouyou.mickey.mysql;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TableConfig {

	private static Set<String> tableNames;

	public static boolean isVersionTable(String tableName) {
		if (tableNames != null)
			return tableNames.contains(tableName.toLowerCase());
		return true;
	}

	public static void setTableNames(String tableNames) {
		TableConfig.tableNames = new HashSet<String>(Arrays.asList(tableNames.toLowerCase().split(",")));
	}
}
