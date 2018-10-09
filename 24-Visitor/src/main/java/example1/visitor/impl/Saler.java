package example1.visitor.impl;

import example1.product.impl.Apple;
import example1.product.impl.Book;
import example1.visitor.Visitor;

/**
 * 具体访问者实现了每个由抽象访问者声明的操作，每一个操作用于访问对象结构中一种类型的元素。
 * 
 * @author wuzz
 * @date 2018年10月9日 上午11:59:58
 */
public class Saler extends Visitor {

	@Override
	public void visit(Apple apple) {
		System.out.println("收银员" + name + "给苹果过秤，然后计算其价格。");
	}

	@Override
	public void visit(Book book) {
		System.out.println("收银员" + name + "直接计算书的价格。");
	}
}