package observer;

public class Test {
	public static void main(String[] args) {
		Subject subject = new ConcrateSubject();
		
		Observer observer1 = new ConcrateObserver();
		Observer observer2 = new ConcrateObserver();
		Observer observer3 = new ConcrateObserver();
		
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		subject.addObserver(observer3);
		
		subject.notifyObservers("天气不错");
		subject.deleteObserver(observer2);
		subject.notifyObservers("饿了想吃肉");
	}

}
