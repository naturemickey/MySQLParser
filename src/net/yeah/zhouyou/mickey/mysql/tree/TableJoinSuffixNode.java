package net.yeah.zhouyou.mickey.mysql.tree;

import java.util.ArrayList;
import java.util.List;

public class TableJoinSuffixNode extends SQLSyntaxTreeNode {
	private String tableJoinMod;
	private TableNameAndAliasesNode tables;
	private JoinConditionNode condition;
	private TableJoinSuffixNode suffix;

	public TableJoinSuffixNode(String tableJoinMod, TableNameAndAliasesNode tables, JoinConditionNode condition, TableJoinSuffixNode suffix) {
		this.tableJoinMod = tableJoinMod.toLowerCase();
		this.tables = tables;
		this.condition = condition;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.tableJoinMod);
		sb.append(" join ");
		int size = tables.all().size();
		if (size == 1) {
			sb.append(tables).append(' ');
		} else {
			sb.append('(').append(tables).append(") ");
		}
		sb.append(condition);
		if (suffix != null)
			sb.append(' ').append(suffix);
		return sb.toString();
	}
	public List<TableNameAndAliasNode> getRealTables() {
		List<TableNameAndAliasNode> res = new ArrayList<>();
		res.addAll(tables.all());
		if (suffix != null)
			res.addAll(suffix.getRealTables());
		return res;
	}
}
