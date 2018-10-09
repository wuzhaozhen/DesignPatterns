package example1.ObjectStructure;

import java.util.*;

import example1.product.Product;
import example1.visitor.Visitor;

/**
 * 对象结构是一个元素的集合，它用于存放元素对象，并且提供了遍历其内部元素的方法。
 * 它可以结合组合模式来实现，也可以是一个简单的集合对象，如一个List对象或一个Set对象。
 * 
 * @author wuzz
 * @date 2018年10月9日 上午11:28:21
 */
public class BuyBasket {
	private ArrayList<Product> list = new ArrayList<Product>();

	public void accept(Visitor visitor) {
		Iterator<Product> i = list.iterator();

		while (i.hasNext()) {
			((Product) i.next()).accept(visitor);
		}
	}

	public void addProduct(Product product) {
		list.add(product);
	}

	public void removeProduct(Product product) {
		list.remove(product);
	}
}