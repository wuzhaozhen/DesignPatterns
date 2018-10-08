package example1.node.impl.children;

import example1.node.Node;
import example1.node.impl.SymbolNode;

public class ModNode extends SymbolNode {
	public ModNode(Node left, Node right) {
		super(left, right);
	}
	
	@Override
	public int interpret() {
		return super.left.interpret() % super.right.interpret();
	}
}