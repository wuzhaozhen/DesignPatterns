package example1;

import example1.factory.TVFactory;
import example1.factory.impl.HaierTVFactory;
import example1.product.TV;

public class Client {
	public static void main(String args[]) {
		TV tv;
		TVFactory factory;
		factory = new HaierTVFactory();
		tv = factory.produceTV();
		tv.play();
	}
}
