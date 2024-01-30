package A2.Solution2WithCompositeDesign;

public class Number implements IArithmeticExpression {
	
	int number;
	
	Number(int number){
		this.number=number;
	}

	@Override
	public int evaluate() {
		System.out.println("Number is:"+number);
		return number;
	}

}
