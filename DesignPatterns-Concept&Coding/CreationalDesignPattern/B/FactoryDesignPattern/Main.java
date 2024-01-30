package B.FactoryDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		ShapeFactory factory=new ShapeFactory();
		IShape obj=factory.getShape("CIRCLE");
		obj.display();

	}

}
