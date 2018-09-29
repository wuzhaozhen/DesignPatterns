package example2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
	private Object obj;

	public DynamicProxy() {
	}

	public DynamicProxy(Object obj) {
		this.obj = obj;
	}

	/**
	 * proxy：被代理的对象
	 * method：被代理的方法
	 * args：参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		preRequest();
		method.invoke(obj, args);
		postRequest();
		return null;
	}

	public void preRequest() {
		System.out.println("调用之前！");
	}

	public void postRequest() {
		System.out.println("调用之后！");
	}

}