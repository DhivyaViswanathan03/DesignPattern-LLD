package K.NullObjectDesignPattern;

public class VechileFactory {
	
	public static IVechile getVechileObject(String typeOfVechile) {
		if("car".equalsIgnoreCase(typeOfVechile)) {
			return new Car();
		}else {
			return new Nullvechile();
		}
	}

}
