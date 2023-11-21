package net.yeah.zhouyou.mickey.mysql.tree;

public class ExpressionLikeNode extends ExpressionNode {
	private boolean not;
	private ElementNode left;
	private ElementNode right;

	public ExpressionLikeNode(boolean not, ElementNode left, ElementNode right) {
		this.not = not;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		String like = not ? " not like " : " like ";
		return left + like + right;
	}

}
