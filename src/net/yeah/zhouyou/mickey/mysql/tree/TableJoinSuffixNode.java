package net.yeah.zhouyou.mickey.mysql.tree;

import java.util.ArrayList;
import java.util.List;

public class TableJoinSuffixNode extends SQLSyntaxTreeNode {
	private String tableJoinMod;
	private TableNameAndAliasNode table;
	private JoinConditionNode condition;
	private TableJoinSuffixNode suffix;

	public TableJoinSuffixNode(String tableJoinMod, TableNameAndAliasNode table, JoinConditionNode condition, TableJoinSuffixNode suffix) {
		this.tableJoinMod = tableJoinMod.toLowerCase();
		this.table = table;
		this.condition = condition;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.tableJoinMod);
		sb.append(" join ");
		sb.append(table).append(' ');
		sb.append(condition);
		if (suffix != null)
			sb.append(' ').append(suffix);
		return sb.toString();
	}
	public List<TableNameAndAliasNode> getRealTables() {
		List<TableNameAndAliasNode> res = new ArrayList<>();
		res.add(table);
		if (suffix != null)
			res.addAll(suffix.getRealTables());
		return res;
	}
}
