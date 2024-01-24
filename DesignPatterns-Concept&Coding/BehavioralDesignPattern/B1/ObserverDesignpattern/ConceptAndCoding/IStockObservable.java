package B1.ObserverDesignpattern.ConceptAndCoding;

public interface IStockObservable {
	
	public void add(INotificationAlertObserver observer);
	
	public void remove(INotificationAlertObserver observer);
	
	public void notifySubscribers();
	
	public void setStockCount(int stockCount);
	public int getStockCount();
	

}
