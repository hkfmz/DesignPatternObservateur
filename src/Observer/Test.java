package Observer;

public class Test {
	public static void main(String[] args)
	{
		ObservableImpl observable = new ObservableImpl();
		Observer Client1 = new A();
		Observer Client2 = new B();
		Observer Client3 = new C();
		
		observable.subscribe(Client1);
		observable.setState(100);
	}

}
