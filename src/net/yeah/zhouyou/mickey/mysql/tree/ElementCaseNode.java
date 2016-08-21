package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementCaseNode extends ElementOpFactoryNode {
	private ElementNode value;
	private CaseWhenPartNode caseWhenPart;
	private ElementNode elseEl;

	public ElementCaseNode(ElementNode value, CaseWhenPartNode caseWhenPart, ElementNode elseEl) {
		this.value = value;
		this.caseWhenPart = caseWhenPart;
		this.elseEl = elseEl;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("case ");
		if (value != null) {
			sb.append(value).append(' ');
		}
		sb.append(caseWhenPart).append(' ');
		if (elseEl != null) {
			sb.append("else").append(' ').append(elseEl).append(' ');
		}
		sb.append("end");
		return sb.toString();
	}
}