package B.ObserverDesignPattern.Telusko;

import java.util.ArrayList;
import java.util.List;

public class Channel implements ISubject {
	
	
	private List<IObserver> subs=new ArrayList();
	
	
	@Override
	public void Subscribe(IObserver sb) {
		subs.add(sb);
	}
	
	@Override
	public void Unsubscribe(IObserver sb) {
		subs.remove(sb);
	}
	
	@Override
	public void notifySubscribers() {
		
		for(IObserver sb:subs) {
			sb.update();
		}
	}
	
	@Override
	public void upload(String title) {
		System.out.println("Title is:"+title);
		notifySubscribers();
	}




}
