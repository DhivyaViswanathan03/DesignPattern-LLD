package A1.WithStrategyPattern;


public class SportsVechile extends Vechile{
	
	public SportsVechile() {
		super(new SportsDriveStrategy());
	}

}
