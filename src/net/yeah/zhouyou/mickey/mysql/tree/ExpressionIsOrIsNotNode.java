package net.yeah.zhouyou.mickey.mysql.tree;

public class ExpressionIsOrIsNotNode extends ExpressionNode {

	private ElementNode element;
	private boolean not;
	private String what;

	public ExpressionIsOrIsNotNode(ElementNode element, boolean not, String what) {
		this.element = element;
		this.not = not;
		this.what = what.toLowerCase();
	}

	@Override
	public String toString() {
		if (!not) {
			return this.element + " is " + what;
		} else {
			return this.element + " is not " + what;
		}
	}

}
