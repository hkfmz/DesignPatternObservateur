package Observer;

public interface Observable {
   public void subscribe(Observer Ob);
   public void unsubscribe(Observer Ob);
   public void notifyObservers();
}
