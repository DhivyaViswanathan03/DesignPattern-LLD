package D.BridgeDesignPattern;

public class Main {

	public static void main(String[] args) {
		ALivingThings dog=new  Dog(new LandBreatheImplementation());
		dog.breatheProcess();
		
		ALivingThings fish=new  Fish(new WaterBreatheImplementation());
		fish.breatheProcess();

	}

}
