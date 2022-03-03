package Observer;

public class B implements Observer{

	@Override
	public void update(Observable observable) 
	{
		int state = ((ObservableImpl)observable).getState();
		System.out.println("-----------------------------------------");
		System.out.println("Notification reçu par stephane = "+ state);
		System.out.println("Je l'additionne avec 33 donc : "+ (state+33));
		System.out.println("-----------------------------------------");
	}
}
