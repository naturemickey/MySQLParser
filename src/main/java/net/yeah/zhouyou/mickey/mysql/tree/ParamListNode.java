package net.yeah.zhouyou.mickey.mysql.tree;

public class ParamListNode extends SQLSyntaxTreeNode {

	private ElementNode element;
	ExpressionRelationalNode exprRelational;
	private ParamListNode suffix;

	public ParamListNode(ElementNode element, ExpressionRelationalNode exprRelational, ParamListNode suffix) {
		this.element = element;
		this.exprRelational = exprRelational;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (element != null) {
			sb.append(element);
		} else if (exprRelational != null) {
			sb.append(exprRelational);
		}
		if (suffix != null) {
			sb.append(", ").append(suffix);
		}
		return sb.toString();
	}

}
