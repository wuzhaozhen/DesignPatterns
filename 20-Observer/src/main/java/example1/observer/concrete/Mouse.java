package example1.observer.concrete;

import example1.observer.MyObserver;

/**
 * 具体观察者
 * 
 * @author wuzz
 * @date 2018年10月8日 上午10:42:33
 */
public class Mouse implements MyObserver {
	@Override
	public void response(String msg) {
		System.out.println(msg + ",老鼠努力逃跑！");
	}
}