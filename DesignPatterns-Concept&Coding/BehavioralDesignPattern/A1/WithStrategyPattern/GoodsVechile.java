package A1.WithStrategyPattern;

public class GoodsVechile extends Vechile {

	public GoodsVechile() {
		super(new NormalDriveStrategy());
	}

}
