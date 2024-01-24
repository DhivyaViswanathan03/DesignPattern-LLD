package A1.WithStrategyPattern;

public class Vechile {
	
	IDriveStrategy driveStrategy;
	
	Vechile(IDriveStrategy driveStrategy){
		this.driveStrategy=driveStrategy;
	}
	
	public void drive() {
		driveStrategy.drive();
	}
}
