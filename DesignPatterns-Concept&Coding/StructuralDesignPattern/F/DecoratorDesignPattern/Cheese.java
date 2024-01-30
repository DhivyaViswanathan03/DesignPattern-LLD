package F.DecoratorDesignPattern;

public class Cheese extends AToppingDecorator {
	
	ABasePizza basePizza;
	
	Cheese(ABasePizza basePizza){
		this.basePizza=basePizza;
	}

	@Override
	public int cost() {
		return this.basePizza.cost()+10;
	}

}
