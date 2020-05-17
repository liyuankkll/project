package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
		Object object = new RealSubject();
		
		//初步代理角色
		
		InvocationHandler handler  = new DynamicProxy(object);
		
		//最终代理角色
		
		Subject subject = (Subject)Proxy.newProxyInstance(handler.getClass().getClassLoader(), object.getClass().getInterfaces(), handler);
		subject.rent();
	}
}
