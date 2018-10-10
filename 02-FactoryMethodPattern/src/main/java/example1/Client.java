package example1;

import example1.factory.TVFactory;
import example1.factory.concrete.HaierTVFactory;
import example1.product.TV;

public class Client {
	public static void main(String args[]) {
		TVFactory factory = new HaierTVFactory();
		TV tv = factory.produceTV();
		tv.play();
	}
}
