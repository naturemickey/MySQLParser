package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementOpEleNode extends ElementNode {

	private ElementTextNode elementText;
	private ElementOpEleSuffixNode suffix;

	public ElementOpEleNode(ElementTextNode elementText, ElementOpEleSuffixNode suffix) {
		this.elementText = elementText;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		if (suffix != null) {
			return elementText.toString() + ' ' + suffix;
		} else {
			return elementText.toString();
		}
	}

	public ElementTextNode getElementText() {
		return elementText;
	}

	public void setElementText(ElementTextNode elementText) {
		this.elementText = elementText;
	}

	public ElementOpEleSuffixNode getSuffix() {
		return suffix;
	}

	public void setSuffix(ElementOpEleSuffixNode suffix) {
		this.suffix = suffix;
	}

}
