package K.NullObjectDesignPattern;

public class Car implements IVechile {

	@Override
	public int getTankCapacity() {
		return 40;
	}

	@Override
	public int getSeatCapacity() {
		return 5;
	}

}
