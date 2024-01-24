package F.TemplateDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		APaymentFlow paymentFlow=new PayToFriend();
		
		paymentFlow.execute();

	}

}
