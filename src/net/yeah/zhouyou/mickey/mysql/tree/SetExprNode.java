package net.yeah.zhouyou.mickey.mysql.tree;

public class SetExprNode extends SQLSyntaxTreeNode {
	private ElementNode left;
	private ElementNode right;

	public SetExprNode(ElementNode left, ElementNode right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return left.toString() + '=' + (right == null ? "DEFAULT" : right);
	}
}
