package net.yeah.zhouyou.mickey.mysql.tree;

public class ExpressionInSelectNode extends ExpressionNode {

	private ElementNode element;
	private SelectNode select;

	public ExpressionInSelectNode(ElementNode element, SelectNode select) {
		this.element = element;
		this.select = select;
	}

	@Override
	public String toString() {
		return this.element.toString() + " in (" + this.select + ")";
	}

}
