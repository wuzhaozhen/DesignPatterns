package example1.visitor;

import example1.product.impl.Apple;
import example1.product.impl.Book;

/**
 * 抽象访问者为对象结构中每一个具体元素类声明一个访问操作;
 * 从这个操作的名称或参数类型可以清楚知道需要访问的具体元素的类型，具体访问者需要实现这些操作方法，定义对这些元素的访问操作。
 * 
 * @author wuzz
 * @date 2018年10月9日 上午11:57:44
 */
public abstract class Visitor {
	protected String name;

	public void setName(String name) {
		this.name = name;
	}

	public abstract void visit(Apple apple);

	public abstract void visit(Book book);
}