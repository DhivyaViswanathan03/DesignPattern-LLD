package C.FacadeDesignPattern;

public class OrderFacade {
	
	MakePayment payment;
	GenerateInvoice invoice;
	SendNotification notify;
	Product product;
	
	OrderFacade(){
		payment=new MakePayment();
		invoice=new GenerateInvoice();
		notify=new SendNotification();
		product=new Product();
	}
	
	public void createOrder() {
		product.getProduct();
		payment.makePayment();
		notify.sendNotification();
		invoice.generateInvoice();
	}

}
