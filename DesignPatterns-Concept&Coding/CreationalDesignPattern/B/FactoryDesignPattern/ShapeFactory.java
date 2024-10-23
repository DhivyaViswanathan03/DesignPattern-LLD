package B.FactoryDesignPattern;

public class ShapeFactory {
	
//	IShape shape;
	public IShape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else {
			return null;
		}
	}
	

}
