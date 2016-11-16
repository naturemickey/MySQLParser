package net.yeah.zhouyou.mickey.mysql;

import java.util.HashSet;
import java.util.Set;

public class TableConfig {

    private static Set<String> noneVersionTableNames;

    public static boolean isVersionTable(String tableName) {
        if (noneVersionTableNames != null)
            return !noneVersionTableNames.contains(tableName.toLowerCase());
        return true;
    }

    public static void setNoneVersionTableNames(String noneVersionTableNames) {
        if (noneVersionTableNames != null && noneVersionTableNames.length() > 0) {
            String[] tables = noneVersionTableNames.toLowerCase().split(",");
            if (tables.length > 0) {
                TableConfig.noneVersionTableNames = new HashSet<String>();
                for (String table : tables) {
                    TableConfig.noneVersionTableNames.add(table.trim());
                }
            }
        }
    }
}
