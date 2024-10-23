package B1.ObserverDesignpattern.ConceptAndCoding;

public class Store {

	public static void main(String[] args) {
		
		IStockObservable observable=new  IPhoneObserverIml();
		
		INotificationAlertObserver observer1=new EmailAlertObserverImpl("divs@gmail.com",observable);
		INotificationAlertObserver observer2=new EmailAlertObserverImpl("mouli@gmail.com",observable);
		INotificationAlertObserver observer3=new MobileAlertObserverImpl("Dheeran",observable);
		
		observable.add(observer1);
		observable.add(observer2);
		observable.add(observer3);
		
		observable.remove(observer2);
		
		observable.setStockCount(10);
	}

}
