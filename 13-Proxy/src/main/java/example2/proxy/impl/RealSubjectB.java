package example2.proxy.impl;

import example2.proxy.AbstractSubject;

public class RealSubjectB implements AbstractSubject {
	
	@Override
	public void request() {
		System.out.println("真实主题类B！");
	}

	@Override
	public void response() {
		System.out.println("真实主题类B2！");
	}
}