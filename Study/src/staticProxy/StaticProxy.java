package staticProxy;
//代理.执行对真实角色的引用 + 其他操作
public class StaticProxy extends Subject {
	// **静态代理必须含有真实对象的引用
	Subject subject = new RealSubject();
	
	public void before() {
		System.out.println("打扫卫生");
	}
	
	public void after() {
		System.out.println("多收一个月租金");
	}
	
	@Override
	public int rent() {
		this.before();
		
		this.after();
		
		return subject.rent();
		

		
	}
	
}
