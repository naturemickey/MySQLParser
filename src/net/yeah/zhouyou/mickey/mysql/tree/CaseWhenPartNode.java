package net.yeah.zhouyou.mickey.mysql.tree;

public class CaseWhenPartNode extends SQLSyntaxTreeNode {
	private ElementNode whenEl;
	private ExpressionRelationalNode whenRe;
	private ElementNode then;
	private CaseWhenPartNode suffix;

	public CaseWhenPartNode(ElementNode whenEl, ExpressionRelationalNode whenRe, ElementNode then, CaseWhenPartNode suffix) {
		this.whenEl = whenEl;
		this.whenRe = whenRe;
		this.then = then;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("when ");
		if (whenEl != null) {
			sb.append(whenEl).append(' ');
		}
		if (whenRe != null) {
			sb.append(whenRe).append(' ');
		}
		sb.append("then ").append(then);
		if (suffix != null) {
			sb.append(' ').append(suffix);
		}
		return sb.toString();
	}
}
