package net.yeah.zhouyou.mickey.mysql.tree;

public class SetExprsNode extends SQLSyntaxTreeNode {

	private SetExprNode setExpr;
	private SetExprsNode suffix;

	public SetExprsNode(SetExprNode setExpr, SetExprsNode suffix) {
		this.setExpr = setExpr;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		if (suffix == null) {
			return setExpr.toString();
		} else {
			return setExpr.toString() + ", " + suffix.toString();
		}
	}

}
