package C.AbstractFactoryDesignPattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}else {
			return null;
		}
		
	}

}
