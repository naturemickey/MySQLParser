package net.yeah.zhouyou.mickey.mysql.tree;

public class ExpressionInSelectNode extends ExpressionNode {

	private ElementNode element;
	private boolean not;
	private SelectNode select;

	public ExpressionInSelectNode(ElementNode element, boolean not, SelectNode select) {
		this.element = element;
		this.not = not;
		this.select = select;
	}

	@Override
	public String toString() {
		if (not) {
			return this.element.toString() + " not in (" + this.select + ")";
		} else {
			return this.element.toString() + " in (" + this.select + ")";
		}
	}

}
