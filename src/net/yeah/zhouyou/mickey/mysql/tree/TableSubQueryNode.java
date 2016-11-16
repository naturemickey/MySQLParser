package net.yeah.zhouyou.mickey.mysql.tree;

import java.util.ArrayList;
import java.util.List;

public class TableSubQueryNode extends TableRelNode {

	private SelectNode select;
	private String alias;

	public TableSubQueryNode(SelectNode select, String alias) {
		this.select = select;
		this.alias = alias;
	}

	@Override
	public String toString() {
		return "(" + select + ") " + alias;
	}

	@Override
	public List<TableRelNode.TableAndJoinMod> getRealTables() {
		return new ArrayList<>();
	}
}
