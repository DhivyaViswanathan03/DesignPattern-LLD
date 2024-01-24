package B1.ObserverDesignpattern.ConceptAndCoding;

public class MobileAlertObserverImpl implements INotificationAlertObserver {

	public String userName;


	public MobileAlertObserverImpl(String userName) {
		this.userName = userName;
	}

	@Override
	public void update() {
		System.out.println(userName + " Product is avilable hurry up!");
	}

}
