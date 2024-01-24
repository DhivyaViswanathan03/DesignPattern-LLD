package A1.WithStrategyPattern;

public class NormalDriveStrategy implements IDriveStrategy {

	@Override
	public void drive() {
		System.out.println("Normal drive strategy");
	}

}
