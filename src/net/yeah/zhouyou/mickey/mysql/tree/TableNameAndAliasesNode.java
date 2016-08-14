package net.yeah.zhouyou.mickey.mysql.tree;

public class TableNameAndAliasesNode extends SQLSyntaxTreeNode {

	private TableNameAndAliasNode tableNameAndAlias;
	private TableNameAndAliasesNode suffix;

	public TableNameAndAliasesNode(TableNameAndAliasNode tableNameAndAlias, TableNameAndAliasesNode suffix) {
		this.tableNameAndAlias = tableNameAndAlias;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		if (suffix == null) {
			return this.tableNameAndAlias.toString();
		} else {
			return this.tableNameAndAlias.toString() + ", " + suffix;
		}
	}

}
