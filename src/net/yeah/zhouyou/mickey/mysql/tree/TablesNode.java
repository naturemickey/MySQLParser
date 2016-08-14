package net.yeah.zhouyou.mickey.mysql.tree;

import java.util.List;

public class TablesNode extends SQLSyntaxTreeNode {

	private TableRelNode tableRel;
	private TablesNode suffix;

	public TablesNode(TableRelNode tableRel, TablesNode suffix) {
		this.tableRel = tableRel;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		if (suffix == null)
			return tableRel.toString();
		return tableRel + ", " + suffix;
	}

	public List<TableNameAndAliasNode> getRealTables() {
		List<TableNameAndAliasNode> tables = tableRel.getRealTables();
		if (suffix != null)
			tables.addAll(suffix.getRealTables());
		return tables;
	}
}
