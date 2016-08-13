package net.yeah.zhouyou.mickey.mysql;

import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLBaseVisitor;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLParser;
import net.yeah.zhouyou.mickey.mysql.tree.ColumnNamesNode;
import net.yeah.zhouyou.mickey.mysql.tree.DeleteNode;
import net.yeah.zhouyou.mickey.mysql.tree.InsertNode;
import net.yeah.zhouyou.mickey.mysql.tree.SQLSyntaxTreeNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableNameAndAliasNode;
import net.yeah.zhouyou.mickey.mysql.tree.ValueListNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionNode;

public class MySQLVisitorImpl extends MySQLBaseVisitor<SQLSyntaxTreeNode> {

	@Override
	public SQLSyntaxTreeNode visitInsertStat(MySQLParser.InsertStatContext ctx) {
		String tableName = ctx.tableName.getText();
		ColumnNamesNode columnNames = (ColumnNamesNode) visitColumnNames(ctx.columnNames());
		ValueListNode valueNames = (ValueListNode) visitValueList(ctx.valueList());

		return new InsertNode(tableName, columnNames, valueNames);
	}

	@Override
	public SQLSyntaxTreeNode visitColumnNames(MySQLParser.ColumnNamesContext ctx) {
		String name = ctx.name.getText();
		ColumnNamesNode suffix = ctx.columnNamesSuffix() != null ? (ColumnNamesNode) visitColumnNamesSuffix(ctx.columnNamesSuffix()) : null;

		return new ColumnNamesNode(name, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitColumnNamesSuffix(MySQLParser.ColumnNamesSuffixContext ctx) {
		return visitColumnNames(ctx.columnNames());
	}

	@Override
	public SQLSyntaxTreeNode visitValueList(MySQLParser.ValueListContext ctx) {
		String name = ctx.name.getText();
		ValueListNode suffix = ctx.valueListSuffix() != null ? (ValueListNode) visitValueListSuffix(ctx.valueListSuffix()) : null;

		return new ValueListNode(name, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitValueListSuffix(MySQLParser.ValueListSuffixContext ctx) {
		return visitValueList(ctx.valueList());
	}

	@Override
	public SQLSyntaxTreeNode visitDeleteStat(MySQLParser.DeleteStatContext ctx) {
		TableNameAndAliasNode tableNameAndAlias = (TableNameAndAliasNode) this.visitTableNameAndAlias(ctx.tableNameAndAlias());
		WhereConditionNode whereCondition = ctx.whereCondition() != null ? (WhereConditionNode) this.visitWhereCondition(ctx.whereCondition()) : null;
		String rowCount = ctx.rowCount != null ? ctx.rowCount.getText() : null;

		return new DeleteNode(tableNameAndAlias, whereCondition, rowCount);
	}

	@Override
	public SQLSyntaxTreeNode visitTableNameAndAlias(MySQLParser.TableNameAndAliasContext ctx) {
		return new TableNameAndAliasNode(ctx.name.getText(), ctx.alias.getText());
	}
}
