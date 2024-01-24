package B.ObserverDesignPattern.Telusko;

public class Youtube {

	public static void main(String[] args) {
		
		IObserver sb1=new Subscriber("divs");
		IObserver sb2=new Subscriber("mouli");
		IObserver sb3=new Subscriber("priya");
		IObserver sb4=new Subscriber("revathi");
		IObserver sb5=new Subscriber("sumathi");
		
		Channel telusko=new Channel();
		telusko.Subscribe(sb1);
		telusko.Subscribe(sb2);
		telusko.Subscribe(sb3);
		telusko.Subscribe(sb4);
		telusko.Subscribe(sb5);
		
		telusko.Unsubscribe(sb5);
		
		telusko.upload("How to learn JAVA");
		
		sb1.subscribeChannel(telusko);
		sb2.subscribeChannel(telusko);
		sb3.subscribeChannel(telusko);
		sb4.subscribeChannel(telusko);
		sb5.subscribeChannel(telusko);

	}

}
