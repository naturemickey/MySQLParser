package net.yeah.zhouyou.mickey.mysql.tree;

public class ExpressionExistsNode extends ExpressionNode {

	private boolean not;
	private SelectNode select;

	public ExpressionExistsNode(boolean not, SelectNode select) {
		this.not = not;
		this.select = select;
	}

	@Override
	public String toString() {
		return (not ? "not exists" : "exists") + '(' + select + ')';
	}

}
