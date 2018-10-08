package example3.observer;

import example3.subject.Subject;

/**
 * 观察者对象
 * 
 * @author wuzz
 * @date 2018年10月8日 上午11:00:22
 */
public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}
