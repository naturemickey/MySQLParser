package net.yeah.zhouyou.mickey.mysql.tree;

import java.util.List;
import java.util.stream.Collectors;

public class ValueListNode extends SQLSyntaxTreeNode {

	private List<ElementNode> elements;
	
	public ValueListNode(List<ElementNode> elements) {
		this.elements = elements;
	}

	@Override
	public String toString() {
		return this.elements.stream().map(e -> e.toString()).collect(Collectors.joining(", "));
	}
	
	public void addElementNode(ElementNode node) {
		this.elements.add(node);
	}

}
