package example1.product.impl;

import example1.product.Product;
import example1.visitor.Visitor;
/**
 * 具体元素实现了accept()方法，在accept()方法中调用访问者的访问方法以便完成对一个元素的操作。
 * 
 * @author wuzz  
 * @date 2018年10月9日 下午12:01:25
 */
public class Book implements Product {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}