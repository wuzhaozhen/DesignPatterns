package example2.proxy.impl;

import example2.proxy.AbstractSubject;

public class RealSubjectA implements AbstractSubject {

	@Override
	public void request() {
		System.out.println("真实主题类A！");
	}

	@Override
	public void response() {
		System.out.println("真实主题类A2！");
	}
}