package dynamicProxy;

public class RealSubject implements Subject{

	@Override
	public int rent() {
		System.out.println("真正的房主租房");
		return  3000;
	}

}
