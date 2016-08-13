package net.yeah.zhouyou.mickey.mysql.tree;

public class WhereConditionSubNode extends WhereConditionNode {

	private WhereConditionNode whereCondition;

	public WhereConditionSubNode(WhereConditionNode whereCondition) {
		this.whereCondition = whereCondition;
	}

	@Override
	public String toString() {
		return "(" + whereCondition +")";
	}
}
