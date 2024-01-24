package B1.ObserverDesignpattern.ConceptAndCoding;

public class EmailAlertObserverImpl implements INotificationAlertObserver {
	public String emailId;


	public EmailAlertObserverImpl(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public void update() {
		System.out.println(emailId + " Product is avilable hurry up!");
	}
	

}
