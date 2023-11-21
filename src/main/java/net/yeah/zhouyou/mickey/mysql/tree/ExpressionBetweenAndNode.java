package net.yeah.zhouyou.mickey.mysql.tree;

public class ExpressionBetweenAndNode extends ExpressionNode {
	private ElementNode element;
	private boolean not;
	private ElementNode left;
	private ElementNode right;

	public ExpressionBetweenAndNode(ElementNode element, boolean not, ElementNode left, ElementNode right) {
		this.element = element;
		this.not = not;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return element.toString() + (not ? " not " : "") + " between " + left + " and " + right;
	}
}
