package example1;

import example1.factory.TV;
import example1.factory.impl.HaierTV;
import example1.factory.impl.HisenseTV;

public class Client {
	public static void main(String args[]) {
		TV tv = new HaierTV();
		tv.play();
		tv = new HisenseTV();
		tv.play();
	}
}
