package K.NullObjectDesignPattern;

public class Nullvechile implements IVechile {
	
	@Override
	public int getTankCapacity() {
		return 0;
	}

	@Override
	public int getSeatCapacity() {
		return 0;
	}

}
