package net.yeah.zhouyou.mickey.mysql.tree;

import java.util.List;
import java.util.stream.Collectors;

public class SetExprsNode extends SQLSyntaxTreeNode {

	private List<SetExprNode> setExprs;

	public SetExprsNode(List<SetExprNode> setExprs) {
		this.setExprs = setExprs;
	}

	@Override
	public String toString() {
		return setExprs.stream().map(se -> se.toString()).collect(Collectors.joining(", "));
	}

	public void addSetExpr(SetExprNode se) {
		this.setExprs.add(se);
	}

}
