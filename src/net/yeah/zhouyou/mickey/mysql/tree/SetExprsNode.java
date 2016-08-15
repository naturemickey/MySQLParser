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

	public SetExprsNode getLastNode() {
		if (suffix == null) {
			return this;
		}
		return suffix.getLastNode();
	}

	public SetExprNode getSetExpr() {
		return setExpr;
	}

	public void setSetExpr(SetExprNode setExpr) {
		this.setExpr = setExpr;
	}

	public SetExprsNode getSuffix() {
		return suffix;
	}

	public void setSuffix(SetExprsNode suffix) {
		this.suffix = suffix;
	}

}
