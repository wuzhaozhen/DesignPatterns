package example1.subject.impl;

import example1.observer.MyObserver;
import example1.subject.MySubject;

/**
 * 具体的被观察者
 * 
 * @author wuzz
 * @date 2018年10月8日 上午10:48:26
 */
public class Cat extends MySubject {
	public void cry() {
		System.out.println("猫叫！");
		System.out.println("----------------------------");

		for (Object obs : observers) {
			((MyObserver) obs).response();
		}

	}
}