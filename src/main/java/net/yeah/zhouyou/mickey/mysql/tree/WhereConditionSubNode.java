package net.yeah.zhouyou.mickey.mysql.tree;

public class WhereConditionSubNode extends WhereConditionNode {

	private WhereConditionNode wc1;
	private String expressionOperator;
	private WhereConditionNode wc2;

	public WhereConditionSubNode(WhereConditionNode whereCondition) {
		this.wc1 = whereCondition;
	}

	public WhereConditionSubNode(WhereConditionNode wc1, String expressionOperator, WhereConditionNode wc2) {
		this.wc1 = wc1;
		this.expressionOperator = expressionOperator;
		this.wc2 = wc2;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('(').append(wc1).append(')');
		if (this.expressionOperator != null && this.wc2 != null) {
			sb.append(' ').append(this.expressionOperator).append(' ').append(this.wc2);
		}
		return sb.toString();
	}

}
