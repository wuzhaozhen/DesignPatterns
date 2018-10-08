package example1.observer.impl;

import example1.observer.MyObserver;

/**
 * 具体观察者
 * 
 * @author wuzz
 * @date 2018年10月8日 上午10:42:33
 */
public class Mouse implements MyObserver {
	public void response() {
		System.out.println("老鼠努力逃跑！");
	}
}