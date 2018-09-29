package example5;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	private Enhancer enhancer=new Enhancer();

	public Object getProxy(Class<?> clazz) {
		// 设置创建子类的类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		// 创建子类
		return enhancer.create();
	}
	/**
	 * 拦截所有目标类方法的调用 
	 * arg0：目标类的示例 ;
	 * arg1:目标方法的反射对象  ;
	 * arg2：方法的参数  ;
	 * arg3：代理类的实例 ;
	 */
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("开始日志处理");
		// 代理类调用父类的方法
		arg3.invokeSuper(arg0, arg2);
		System.out.println("结束日志处理");
		return null;
	}

}
