package net.yeah.zhouyou.mickey.mysql.tree;

public class FunCallNode extends ElementOpFactoryNode {

	private String name;
	private ParamListNode paramList;

	public FunCallNode(String name, ParamListNode paramList) {
		this.name = name;
		this.paramList = paramList;
	}

	@Override
	public String toString() {
		return name + '(' + paramList + ')';
	}

}
