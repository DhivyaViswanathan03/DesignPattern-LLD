package B.ObserverDesignPattern.Telusko;

public class Subscriber implements IObserver {
	
	private String name;
	private ISubject channel=new Channel();
	
	public Subscriber(String name) {
		this.name=name;
	}
	
	@Override
	public void update() {
		System.out.println("Video Uploaded to "+name+" ");
	}
	
	@Override
	public void subscribeChannel(ISubject channel) {
		this.channel=channel;
	     
	}

}
