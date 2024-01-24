package I.MediatorDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		IAuctionMediator mdiator=new Auction();
		Bidder bidder1=new Bidder("a", mdiator);
		Bidder bidder2=new Bidder("b", mdiator);
		bidder1.placeBid(10);
		bidder2.placeBid(100);
		bidder2.placeBid(101);
		bidder2.placeBid(102);

	}

}
