package net.yeah.zhouyou.mickey.mysql.tree;

import java.util.List;
import java.util.stream.Collectors;

public class ElementListNode extends SQLSyntaxTreeNode {

	private List<ElementNode> elements;

	public ElementListNode(List<ElementNode> elements) {
		this.elements = elements;
	}

	@Override
	public String toString() {
		return elements.stream().map(n -> n.toString()).collect(Collectors.joining(", "));
	}

}
