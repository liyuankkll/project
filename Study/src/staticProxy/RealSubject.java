package staticProxy;
//真实角色
public class RealSubject extends Subject{

	@Override
	public int rent() {
		return 1;
	}

}
