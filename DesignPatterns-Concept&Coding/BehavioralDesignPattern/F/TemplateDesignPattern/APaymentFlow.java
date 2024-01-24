package F.TemplateDesignPattern;

public abstract class APaymentFlow {
	
	public abstract void validateRequest();
	public abstract void calculateFees();
	public abstract void debitAmount();
	public abstract void creditAmount();
	
	public final void execute() {
		
		//step1
		validateRequest();
		
		//step2
		calculateFees();
		
		//step3
		debitAmount();
		
		//step4
		creditAmount();
		
	}

}
