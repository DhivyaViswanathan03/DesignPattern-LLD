package A2.Solution2WithCompositeDesign;

public class Main {

	public static void main(String[] args) {
		IArithmeticExpression number2=new Number(2);
		IArithmeticExpression number1=new Number(1);
		IArithmeticExpression number7=new Number(7);
		
		Expression expression=new Expression(number1, number7, OperationEnum.ADD);
		Expression parentExpression=new Expression(number2, expression, OperationEnum.MULTIPLY);
		int result=parentExpression.evaluate();
		
		System.out.println(result);

	}

}
