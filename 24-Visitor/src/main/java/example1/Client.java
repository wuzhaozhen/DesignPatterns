package example1;

import example1.ObjectStructure.BuyBasket;
import example1.product.Product;
import example1.product.impl.Apple;
import example1.product.impl.Book;
import example1.visitor.Visitor;
import example1.visitor.impl.Customer;
import example1.visitor.impl.Saler;

public class Client {
	public static void main(String a[]) {
		Product b1 = new Book();
		Product a1 = new Apple();
		Visitor visitor = new Saler();

		BuyBasket basket = new BuyBasket();
		basket.addProduct(b1);
		basket.addProduct(a1);

		visitor.setName("张三");

		basket.accept(visitor);
		
		visitor=new Customer();
		visitor.setName("李四");
		basket.accept(visitor);
	}
}