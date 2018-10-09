package example1.abstractExpression.nonterminalExpression.children;

import example1.abstractExpression.Node;
import example1.abstractExpression.nonterminalExpression.SymbolNode;

public class ModNode extends SymbolNode {
	public ModNode(Node left, Node right) {
		super(left, right);
	}
	
	@Override
	public int interpret() {
		return super.left.interpret() % super.right.interpret();
	}
}