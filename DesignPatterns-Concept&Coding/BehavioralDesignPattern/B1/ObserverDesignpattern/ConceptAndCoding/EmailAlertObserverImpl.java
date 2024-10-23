package B1.ObserverDesignpattern.ConceptAndCoding;

public class EmailAlertObserverImpl implements INotificationAlertObserver {
	public String emailId;
	IStockObservable observable;

	public EmailAlertObserverImpl(String emailId, IStockObservable observable) {
		this.emailId = emailId;
		this.observable=observable;
	}

	@Override
	public void update() {
		System.out.println(emailId + " Product is avilable hurry up!");
		System.out.println(observable.getStockCount());
	}
	

}
