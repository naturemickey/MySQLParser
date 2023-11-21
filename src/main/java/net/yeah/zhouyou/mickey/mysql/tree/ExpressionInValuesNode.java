package net.yeah.zhouyou.mickey.mysql.tree;

public class ExpressionInValuesNode extends ExpressionNode {

	private ElementNode element;
	private boolean not;
	private ValueListNode values;

	public ExpressionInValuesNode(ElementNode element, boolean not, ValueListNode values) {
		this.element = element;
		this.not = not;
		this.values = values;
	}

	@Override
	public String toString() {
		if (not) {
			return this.element.toString() + " not in (" + this.values + ")";
		} else {
			return this.element.toString() + " in (" + this.values + ")";
		}
	}
}
