package example2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import example2.proxy.AbstractSubject;
import example2.proxy.impl.RealSubjectA;
import example2.proxy.impl.RealSubjectB;
import example2.proxy.proxy.DynamicProxy;

public class Client {
	public static void main(String args[]) {
		InvocationHandler handler = null;
		AbstractSubject subject = null;

		handler = new DynamicProxy(new RealSubjectA());
		subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),
				new Class[] { AbstractSubject.class }, handler);
		subject.response();

		System.out.println("------------------------------");

		handler = new DynamicProxy(new RealSubjectB());
		subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),
				new Class[] { AbstractSubject.class }, handler);
		subject.request();
	}
}