package K.NullObjectDesignPattern;

public class Main {

	public static void main(String[] args) {

		IVechile vechile=VechileFactory.getVechileObject("bike");
		System.out.println(vechile.getTankCapacity());
		System.out.println(vechile.getSeatCapacity());
	}

}
