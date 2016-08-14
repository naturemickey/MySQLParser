package net.yeah.zhouyou.mickey.mysql.tree;

import java.util.ArrayList;
import java.util.List;

public class TableNameAndAliasNode extends TableRelNode {

	private String name;
	private String alias;

	public TableNameAndAliasNode(String name, String alias) {
		this.name = name;
		this.alias = alias;
	}

	@Override
	public String toString() {
		if (alias != null)
			return name + ' ' + alias;
		else
			return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Override
	public List<TableNameAndAliasNode> getRealTables() {
		List<TableNameAndAliasNode> res = new ArrayList<>();
		res.add(this);
		return res;
	}

}