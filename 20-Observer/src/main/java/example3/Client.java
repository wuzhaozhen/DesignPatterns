package example3;

import example3.observer.concrete.BinaryObserver;
import example3.observer.concrete.HexaObserver;
import example3.observer.concrete.OctalObserver;
import example3.subject.Subject;

public class Client {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
