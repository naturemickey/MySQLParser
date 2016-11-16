package net.yeah.zhouyou.mickey.mysql.tree;

import java.util.ArrayList;
import java.util.List;

public class TableJoinNode extends TableRelNode {

	private TableNameAndAliasNode table;
	private TableJoinSuffixNode suffix;

	public TableJoinNode(TableNameAndAliasNode table, TableJoinSuffixNode suffix) {
		this.table = table;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		return table + " " + suffix;
	}

	@Override
	public List<TableAndJoinMod> getRealTables() {
		List<TableAndJoinMod> res = new ArrayList<>();
		res.add(new TableAndJoinMod(table));
		res.addAll(suffix.getRealTables());
		return res;
	}

}
