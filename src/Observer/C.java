package Observer;

public class C implements Observer{

	@Override
	public void update(Observable observable) {
		int state = ((ObservableImpl)observable).getState();
		
		System.out.println("-----------------------------------------");
		System.out.println("Notification reçu par david = "+ state);
		System.out.println("Je le soustrait avec 9 donc : "+ (state-9));
		System.out.println("-----------------------------------------");
	}
}
