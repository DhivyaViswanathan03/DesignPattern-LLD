package I.MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements IAuctionMediator {
	
	List<IColleague> colleagues=new ArrayList();

	@Override
	public void addBidder(IColleague bidder) {
		colleagues.add(bidder);
		
	}

	@Override
	public void placeBid(Bidder bidder, int amount) {
		for(IColleague colleague:colleagues) {
			if(!colleague.getName().equalsIgnoreCase(bidder.getName())) {
				colleague.receiveBidNotification(amount);
			}
		}

	}

	
}
