package example1;

import example1.observer.MyObserver;
import example1.observer.impl.Dog;
import example1.observer.impl.Mouse;
import example1.observer.impl.Pig;
import example1.subject.MySubject;
import example1.subject.impl.Cat;

public class Client {
	public static void main(String a[]) {
		MySubject subject = new Cat();

		MyObserver obs1, obs3;
		obs1 = new Mouse();
		obs3 = new Dog();

		subject.attach(obs1);
		subject.attach(obs3);

		MyObserver obs4;
		obs4 = new Pig();
		subject.attach(obs4);

		subject.cry();
	}
}