package Observer;

public class A implements Observer{

	@Override
	public void update(Observable observable)
	{
		int state = ((ObservableImpl)observable).getState();
		System.out.println("-----------------------------------------");
		System.out.println("Notification reçu par Moustakil = "+ state);
		System.out.println("Je le multiplie par 10 donc : "+ (state*10));
		System.out.println("-----------------------------------------");
	}

}
