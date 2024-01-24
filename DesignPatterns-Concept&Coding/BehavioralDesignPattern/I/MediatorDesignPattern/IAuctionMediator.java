package I.MediatorDesignPattern;

public interface IAuctionMediator {
	void addBidder(IColleague bidder);
	void placeBid(Bidder bidder,int amount);
}
