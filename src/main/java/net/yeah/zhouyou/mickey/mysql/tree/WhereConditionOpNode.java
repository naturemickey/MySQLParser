package net.yeah.zhouyou.mickey.mysql.tree;

public class WhereConditionOpNode extends WhereConditionNode {

	private ExpressionNode expression;
	private String expressionOperator;
	private WhereConditionNode whereCondition;

	public WhereConditionOpNode(ExpressionNode expression, String expressionOperator, WhereConditionNode whereCondition) {
		this.expression = expression;
		this.expressionOperator = expressionOperator;
		this.whereCondition = whereCondition;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(expression.toString());
		if (this.expressionOperator != null && this.whereCondition != null) {
			sb.append(' ').append(this.expressionOperator).append(' ').append(this.whereCondition);
		}
		return sb.toString();
	}

//	public void appendCondition(String expressionOperator, WhereConditionNode whereCondition) {
//		if (this.whereCondition == null) {
//			this.expressionOperator = expressionOperator;
//			this.whereCondition = whereCondition;
//		} else {
//			// 这里不要乱用
//			((WhereConditionOpNode) this.whereCondition).appendCondition(expressionOperator, whereCondition);
//		}
//	}

}
