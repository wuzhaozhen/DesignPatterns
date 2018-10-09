package example1.subject;

import java.util.*;

import example1.observer.MyObserver;

/**
 * 被观察的对象接口
 * 
 * @author wuzz
 * @date 2018年10月8日 上午10:37:40
 */
public abstract class MySubject {
	protected ArrayList<MyObserver> observers = new ArrayList<MyObserver>();

	/**
	 * 添加观察者
	 *
	 * @author wuzz
	 * @date 2018年10月8日 上午10:38:11
	 * @param observer
	 */
	public void attach(MyObserver observer) {
		observers.add(observer);
	}

	/**
	 * 删除指定观察者
	 *
	 * @author wuzz
	 * @date 2018年10月8日 上午10:38:25
	 * @param observer
	 */
	public void detach(MyObserver observer) {
		observers.remove(observer);
	}

	/**
	 * 被观察的对象行为
	 *
	 * @author wuzz
	 * @date 2018年10月8日 上午10:38:44
	 */
	public abstract void cry(String msg);
}