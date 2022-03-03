package Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
	private int state = 0;
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyObservers();
	}

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void subscribe(Observer Ob) {
		this.observers.add(Ob);
		
	}

	@Override
	public void unsubscribe(Observer Ob) {
		this.observers.remove(Ob);
	}

	@Override
	public void notifyObservers() {
		for(Observer ob: observers) {
			ob.update(this);
		}
		
	}

}
