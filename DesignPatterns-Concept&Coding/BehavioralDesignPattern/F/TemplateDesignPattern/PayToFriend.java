package F.TemplateDesignPattern;

public class PayToFriend extends APaymentFlow {

	@Override
	public void validateRequest() {
		System.out.println("PayToFriend.validateRequest()");
	}

	@Override
	public void calculateFees() {
		System.out.println("PayToFriend.calculateFees()");
	}

	@Override
	public void debitAmount() {
		System.out.println("PayToFriend.debitAmount()");
	}

	@Override
	public void creditAmount() {
		System.out.println("PayToFriend.creditAmount()");
	}

}
