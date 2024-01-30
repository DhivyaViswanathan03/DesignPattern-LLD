package D.BridgeDesignPattern;

public class Tree extends ALivingThings {

	Tree(IBreatheImplementer breatheImplementer) {
		super(breatheImplementer);
	}

	@Override
	void breatheProcess() {
		breatheImplementer.breathe();
	}

}
