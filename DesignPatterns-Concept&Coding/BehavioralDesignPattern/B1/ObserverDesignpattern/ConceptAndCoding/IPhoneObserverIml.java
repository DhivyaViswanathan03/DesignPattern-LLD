package B1.ObserverDesignpattern.ConceptAndCoding;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObserverIml implements IStockObservable {

	public List<INotificationAlertObserver> obList = new ArrayList();
	public int stockCount=0;

	@Override
	public void add(INotificationAlertObserver observer) {
		obList.add(observer);

	}

	@Override
	public void remove(INotificationAlertObserver observer) {
		obList.remove(observer);
	}

	@Override
	public void notifySubscribers() {
		
		for(INotificationAlertObserver ob:obList) {
			ob.update();
		}

	}

	@Override
	public void setStockCount(int newStockAdded) {
		
		if(stockCount==0) {
			notifySubscribers();
		}
		stockCount=stockCount+newStockAdded;

	}

	@Override
	public int getStockCount() {
		return stockCount;
	}

}
