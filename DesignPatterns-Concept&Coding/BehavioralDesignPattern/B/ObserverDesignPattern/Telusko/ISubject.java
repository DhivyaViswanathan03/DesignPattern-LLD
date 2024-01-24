package B.ObserverDesignPattern.Telusko;

public interface ISubject {
	void Subscribe(IObserver sb);

	void Unsubscribe(IObserver sb);

	void notifySubscribers();

	void upload(String title);
	


}