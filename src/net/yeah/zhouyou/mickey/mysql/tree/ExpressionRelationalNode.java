package net.yeah.zhouyou.mickey.mysql.tree;

public class ExpressionRelationalNode extends ExpressionNode {
	private ElementNode left;
	private ElementNode right;
	private String relationalOp;

	public ExpressionRelationalNode(ElementNode left, ElementNode right, String relationalOp) {
		this.left = left;
		this.right = right;
		this.relationalOp = relationalOp;
	}

	@Override
	public String toString() {
		return this.left.toString() + ' ' + this.relationalOp + ' ' + this.right;
	}

}
