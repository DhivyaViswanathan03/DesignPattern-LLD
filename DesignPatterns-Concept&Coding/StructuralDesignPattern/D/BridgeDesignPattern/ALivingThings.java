package D.BridgeDesignPattern;

public abstract class ALivingThings {
	IBreatheImplementer breatheImplementer;
	
	ALivingThings(IBreatheImplementer breatheImplementer){
		this.breatheImplementer=breatheImplementer;
		
	}
	
	abstract void breatheProcess();

}
