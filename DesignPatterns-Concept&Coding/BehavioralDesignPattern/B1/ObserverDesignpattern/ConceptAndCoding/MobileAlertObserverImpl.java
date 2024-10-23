package B1.ObserverDesignpattern.ConceptAndCoding;

public class MobileAlertObserverImpl implements INotificationAlertObserver {

	public String userName;
	IStockObservable observable;

	public MobileAlertObserverImpl(String userName, IStockObservable observable) {
		this.userName = userName;
		this.observable=observable;
	}

	@Override
	public void update() {
		System.out.println(userName + " Product is avilable hurry up!");
		System.out.println(observable.getStockCount());
	}

}
