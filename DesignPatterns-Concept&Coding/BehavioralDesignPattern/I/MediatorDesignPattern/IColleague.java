package I.MediatorDesignPattern;

public interface IColleague {
	
	void placeBid(int bidAmount);
	void receiveBidNotification(int bidAmount);
	String getName();

}
