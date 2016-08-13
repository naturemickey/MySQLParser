package net.yeah.zhouyou.mickey.mysql.tree;

public class ExpressionBetweenAndNode extends ExpressionNode {
	private ElementNode element;
	private ElementNode left;
	private ElementNode right;

	public ExpressionBetweenAndNode(ElementNode element, ElementNode left, ElementNode right) {
		this.element = element;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return element.toString() + " between " + left + " and " + right;
	}
}
