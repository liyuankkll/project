package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcrateSubject implements Subject {
	private List<Observer> observers = new ArrayList<Observer>();

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers(String content) {
		for(Observer observer: observers) {
			observer.update(content);
		}
	}

}
