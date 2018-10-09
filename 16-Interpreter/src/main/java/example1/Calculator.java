package example1;

import java.util.*;

import example1.abstractExpression.Node;
import example1.abstractExpression.nonterminalExpression.children.DivNode;
import example1.abstractExpression.nonterminalExpression.children.ModNode;
import example1.abstractExpression.nonterminalExpression.children.MulNode;
import example1.abstractExpression.terminalExpression.ValueNode;

public class Calculator {
	private Node node;

	public void build(String statement) {
		Node left = null, right = null;
		Stack<Node> stack = new Stack<Node>();

		String[] statementArr = statement.split(" ");

		for (int i = 0; i < statementArr.length; i++) {
			if (statementArr[i].equalsIgnoreCase("*")) {
				left = (Node) stack.pop();
				int val = Integer.parseInt(statementArr[++i]);
				right = new ValueNode(val);
				stack.push(new MulNode(left, right));
			} else if (statementArr[i].equalsIgnoreCase("/")) {
				left = (Node) stack.pop();
				int val = Integer.parseInt(statementArr[++i]);
				right = new ValueNode(val);
				stack.push(new DivNode(left, right));
			} else if (statementArr[i].equalsIgnoreCase("%")) {
				left = (Node) stack.pop();
				int val = Integer.parseInt(statementArr[++i]);
				right = new ValueNode(val);
				stack.push(new ModNode(left, right));
			} else {
				stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
			}
		}
		this.node = (Node) stack.pop();
	}

	public int compute() {
		return node.interpret();
	}
}