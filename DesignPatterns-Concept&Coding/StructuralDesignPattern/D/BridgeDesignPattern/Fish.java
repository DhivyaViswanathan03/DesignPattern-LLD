package D.BridgeDesignPattern;

public class Fish extends ALivingThings {

	Fish(IBreatheImplementer breatheImplementer) {
		super(breatheImplementer);
	}

	@Override
	void breatheProcess() {
		breatheImplementer.breathe();
	}

}
