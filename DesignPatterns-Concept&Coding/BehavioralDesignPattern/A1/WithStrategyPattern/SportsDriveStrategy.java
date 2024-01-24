package A1.WithStrategyPattern;

public class SportsDriveStrategy implements IDriveStrategy {

	@Override
	public void drive() {
		System.out.println("Sports drive strategy");
	}

}
