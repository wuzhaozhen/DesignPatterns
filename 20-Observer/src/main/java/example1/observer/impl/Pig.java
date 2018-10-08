package example1.observer.impl;

import example1.observer.MyObserver;

/**
 * 具体观察者
 * 
 * @author wuzz
 * @date 2018年10月8日 上午10:42:33
 */
public class Pig implements MyObserver {
	public void response() {
		System.out.println("猪没有反应！");
	}
}