package net.yeah.zhouyou.mickey.mysql.tree;

public class WhereConditionNotNode extends WhereConditionNode {

	private WhereConditionNode whereCondition;

	public WhereConditionNotNode(WhereConditionNode whereCondition) {
		this.whereCondition = whereCondition;
	}

	@Override
	public String toString() {
		return "(" + whereCondition + ")";
	}
}
