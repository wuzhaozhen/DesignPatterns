package example1;

import example1.factory.EFactory;
import example1.factory.impl.TCLFactory;
import example1.product.AirConditioner;
import example1.product.Television;

public class Client {
	public static void main(String args[]) {
		EFactory factory;
		Television tv;
		AirConditioner ac;
		factory = new TCLFactory();
		tv = factory.produceTelevision();
		tv.play();
		ac = factory.produceAirConditioner();
		ac.changeTemperature();
	}
}
