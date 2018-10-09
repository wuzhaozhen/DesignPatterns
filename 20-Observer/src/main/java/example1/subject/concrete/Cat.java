package example1.subject.concrete;

import example1.observer.MyObserver;
import example1.subject.MySubject;

/**
 * 具体的被观察者
 * 
 * @author wuzz
 * @date 2018年10月8日 上午10:48:26
 */
public class Cat extends MySubject {

	@Override
	public void cry(String msg) {
		System.out.println(msg);
		System.out.println("----------------------------");

		for (Object obs : observers) {
			((MyObserver) obs).response(msg);
		}

	}
}