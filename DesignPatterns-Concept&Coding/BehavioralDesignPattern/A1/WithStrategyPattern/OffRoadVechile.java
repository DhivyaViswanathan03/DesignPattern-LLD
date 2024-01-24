package A1.WithStrategyPattern;

public class OffRoadVechile extends Vechile{
	
	public OffRoadVechile() {
		super(new SportsDriveStrategy());
	}

}
