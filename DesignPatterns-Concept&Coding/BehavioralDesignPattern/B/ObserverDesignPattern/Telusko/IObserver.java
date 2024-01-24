package B.ObserverDesignPattern.Telusko;

public interface IObserver {

	void update();

	void subscribeChannel(ISubject channel);

}