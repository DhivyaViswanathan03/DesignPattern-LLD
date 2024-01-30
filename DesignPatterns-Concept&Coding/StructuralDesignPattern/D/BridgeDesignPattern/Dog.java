package D.BridgeDesignPattern;

public class Dog extends ALivingThings {

	Dog(IBreatheImplementer breatheImplementer) {
		super(breatheImplementer);
	}

	@Override
	void breatheProcess() {
		breatheImplementer.breathe();
	}

}
