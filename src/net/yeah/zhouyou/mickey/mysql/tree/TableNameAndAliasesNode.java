package net.yeah.zhouyou.mickey.mysql.tree;

import java.util.ArrayList;
import java.util.List;

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

	public List<TableNameAndAliasNode> all() {
		List<TableNameAndAliasNode> res = new ArrayList<>();
		res.add(this.tableNameAndAlias);
		if (this.suffix != null) {
			res.addAll(this.suffix.all());
		}
		return res;
	}

}
