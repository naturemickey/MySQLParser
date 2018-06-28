package net.yeah.zhouyou.mickey.mysql.antlr4;

public class MySQLParserGenMain {

	public static void main(String[] args) {
		
		org.antlr.v4.Tool.main(new String[]{"-visitor","src/net/yeah/zhouyou/mickey/mysql/antlr4/MySQL.g4"});

	}

}
