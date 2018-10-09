package example1.abstractExpression.nonterminalExpression;

import example1.abstractExpression.Node;

public abstract class SymbolNode implements Node {
	protected Node left;
	protected Node right;

	public SymbolNode(Node left, Node right) {
		this.left = left;
		this.right = right;
	}
}