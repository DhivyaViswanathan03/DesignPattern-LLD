package F.TemplateDesignPattern;

public class PayToMerchant extends APaymentFlow {

	@Override
	public void validateRequest() {
		System.out.println("PayToMerchant.validateRequest()");
	}

	@Override
	public void calculateFees() {
		System.out.println("PayToMerchant.calculateFees()");
	}

	@Override
	public void debitAmount() {
		System.out.println("PayToMerchant.debitAmount()");
	}

	@Override
	public void creditAmount() {
		System.out.println("PayToMerchant.creditAmount()");
	}

}
