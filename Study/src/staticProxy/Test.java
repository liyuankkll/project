package staticProxy;

public class Test {
	public static void main(String[] args) {
		Subject realRole = new RealSubject();
		realRole.rent();
		
		Subject staticProxic = new StaticProxy();
		staticProxic.rent();
		
	}
}
