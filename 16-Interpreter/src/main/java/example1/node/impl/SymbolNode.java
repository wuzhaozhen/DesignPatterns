package example1.node.impl;

import example1.node.Node;

public abstract class SymbolNode implements Node {
	protected Node left;
	protected Node right;

	public SymbolNode(Node left, Node right) {
		this.left = left;
		this.right = right;
	}
}