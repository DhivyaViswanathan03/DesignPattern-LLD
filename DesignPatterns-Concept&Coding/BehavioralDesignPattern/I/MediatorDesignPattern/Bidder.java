package I.MediatorDesignPattern;

public class Bidder implements IColleague {
	String name;
	IAuctionMediator mediator;
	
	Bidder(String name,IAuctionMediator mediator){
		System.out.println("Bidder.Bidder()"+name);
		this.name=name;
		this.mediator=mediator;
		mediator.addBidder(this);
	}

	@Override
	public void placeBid(int bidAmount) {
		mediator.placeBid(this, bidAmount);
	}

	@Override
	public void receiveBidNotification(int bidAmount) {
		System.out.println(name+" got the notification that some one paid Bid amount "+bidAmount);

	}

	@Override
	public String getName() {
		return name;
	}

}
