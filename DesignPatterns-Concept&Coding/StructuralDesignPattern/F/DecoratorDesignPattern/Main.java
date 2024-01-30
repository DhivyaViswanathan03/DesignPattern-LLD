package F.DecoratorDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		AToppingDecorator toppingDecorator1=new Mushroom(new Margherita());
		int result=toppingDecorator1.cost();
		System.out.println(result);
		
		AToppingDecorator toppingDecorator2=new Mushroom(new Cheese(new Margherita()));
		int result2=toppingDecorator2.cost();
		System.out.println(result2);

	}

}
