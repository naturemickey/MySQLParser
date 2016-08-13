package net.yeah.zhouyou.mickey.mysql.tree;

public class ExpressionIsOrIsNotNode extends ExpressionNode {

	private ElementNode element;
	private boolean not;

	public ExpressionIsOrIsNotNode(ElementNode element, boolean not) {
		this.element = element;
		this.not = not;
	}

	@Override
	public String toString() {
		return this.element.toString() + (not ? " is not null" : " is null");
	}

}
