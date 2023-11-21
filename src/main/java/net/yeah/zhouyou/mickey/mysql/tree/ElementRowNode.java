package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementRowNode extends ElementOpFactoryNode {

	private ParamListNode paramList;

	public ElementRowNode(ParamListNode paramList) {
		this.paramList = paramList;
	}

	@Override
	public String toString() {
		return "row(" + paramList + ")";
	}

}
