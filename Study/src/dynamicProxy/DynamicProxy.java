package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
	//用Object接受任何类型的真实角色
	Object realSubject ;

	public DynamicProxy(Object realRole) {
		this.realSubject = realRole;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.before();
		Object result = method.invoke(realSubject, args);
		this.after();
		return result;
	}

	public void before(){
		System.out.println("打扫房屋");
	}
	
	public void after() {
		System.out.println("修电灯泡");
	}

}
