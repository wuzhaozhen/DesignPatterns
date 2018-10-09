package example3.observer.concrete;

import example3.observer.Observer;
import example3.subject.Subject;

/**
 * 具体的观察者
 * 
 * @author wuzz
 * @date 2018年10月8日 上午11:00:50
 */
public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}
}
