package observer;

public class ConcrateObserver implements Observer{

	public void update(String content) {
		System.out.println(content);
	}
	
}
