package net.yeah.zhouyou.mickey.mysql.tree;

import java.util.List;

public abstract class TableRelNode extends SQLSyntaxTreeNode {

	public abstract List<TableNameAndAliasNode> getRealTables();
	
}
