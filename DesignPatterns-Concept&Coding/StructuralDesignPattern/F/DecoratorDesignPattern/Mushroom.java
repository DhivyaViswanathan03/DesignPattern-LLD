package F.DecoratorDesignPattern;

public class Mushroom extends AToppingDecorator {
	ABasePizza basePizza;
	Mushroom(ABasePizza basePizza){
		this.basePizza=basePizza;
	}

	@Override
	public int cost() {
		return this.basePizza.cost()+15;
	}

}
