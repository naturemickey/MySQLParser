package net.yeah.zhouyou.mickey.mysql.tree;

public class ExpressionInValuesNode extends ExpressionNode {

	private ElementNode element;
	private ValueListNode values;

	public ExpressionInValuesNode(ElementNode element, ValueListNode values) {
		this.element = element;
		this.values = values;
	}

	@Override
	public String toString() {
		return this.element.toString() + " in (" + this.values + ")";
	}
}
