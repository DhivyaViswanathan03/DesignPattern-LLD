package C.AbstractFactoryDesignPattern;

public class Main {

	public static void main(String[] args) {
		FactoryProducer factoryProducer=new FactoryProducer();
		AbstractFactory abstractFactory=factoryProducer.getFactory(true);
		IShape obj=abstractFactory.getShape("RECTANGLE");
		obj.display();
		
		FactoryProducer factoryProducer1=new FactoryProducer();
		AbstractFactory abstractFactory1=factoryProducer1.getFactory(false);
		IShape obj1=abstractFactory1.getShape("CIRCLE");
		obj1.display();
	}

}
