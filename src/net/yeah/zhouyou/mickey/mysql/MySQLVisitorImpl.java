package net.yeah.zhouyou.mickey.mysql;

import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLBaseVisitor;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLParser;
import net.yeah.zhouyou.mickey.mysql.tree.ColumnNamesNode;
import net.yeah.zhouyou.mickey.mysql.tree.InsertNode;
import net.yeah.zhouyou.mickey.mysql.tree.SQLSyntaxTreeNode;
import net.yeah.zhouyou.mickey.mysql.tree.ValueListNode;

public class MySQLVisitorImpl extends MySQLBaseVisitor<SQLSyntaxTreeNode> {

	@Override
	public SQLSyntaxTreeNode visitInsertStat(MySQLParser.InsertStatContext ctx) {
		String tableName = ctx.tableName.getText();
		ColumnNamesNode columnNames = (ColumnNamesNode) visitColumnNames(ctx.columnNames());
		ValueListNode valueNames = (ValueListNode) visitValueList(ctx.valueList());

		InsertNode insert = new InsertNode(tableName, columnNames, valueNames);

		return insert;
	}

	@Override
	public SQLSyntaxTreeNode visitColumnNames(MySQLParser.ColumnNamesContext ctx) {
		String name = ctx.name.getText();
		ColumnNamesNode suffix = null;

		if (ctx.columnNamesSuffix() != null) {
			suffix = (ColumnNamesNode) visitColumnNamesSuffix(ctx.columnNamesSuffix());
		}

		return new ColumnNamesNode(name, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitColumnNamesSuffix(MySQLParser.ColumnNamesSuffixContext ctx) {
		return visitColumnNames(ctx.columnNames());
	}

	@Override
	public SQLSyntaxTreeNode visitValueList(MySQLParser.ValueListContext ctx) {
		String name = ctx.name.getText();
		ValueListNode suffix = null;

		if (ctx.valueListSuffix() != null) {
			suffix = (ValueListNode) visitValueListSuffix(ctx.valueListSuffix());
		}

		return new ValueListNode(name, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitValueListSuffix(MySQLParser.ValueListSuffixContext ctx) {
		return visitValueList(ctx.valueList());
	}
}
