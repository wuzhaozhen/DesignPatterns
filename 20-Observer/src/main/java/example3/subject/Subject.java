package example3.subject;

import java.util.ArrayList;
import java.util.List;

import example3.observer.Observer;
/**
 * 被观察的对象接口
 * 
 * @author wuzz  
 * @date 2018年10月8日 上午10:59:56
 */
public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
