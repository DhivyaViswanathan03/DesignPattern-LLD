package C.AbstractFactoryDesignPattern;

public class FactoryProducer {
	
	public AbstractFactory getFactory(boolean rounded) {
		if(rounded) {
			return new RoundedFactory();
		}else {
			return new ShapeFactory();
		}
	}

}
