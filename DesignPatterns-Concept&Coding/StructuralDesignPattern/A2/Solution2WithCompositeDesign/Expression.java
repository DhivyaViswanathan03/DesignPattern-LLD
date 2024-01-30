package A2.Solution2WithCompositeDesign;

public class Expression implements IArithmeticExpression {

	IArithmeticExpression leftExpression;
	IArithmeticExpression rightExpression;
	OperationEnum operation;

	Expression(IArithmeticExpression leftExpression, 
			IArithmeticExpression rightExpression, OperationEnum operation) {
		this.leftExpression=leftExpression;
		this.rightExpression=rightExpression;
		this.operation=operation;

	}

	@Override
	public int evaluate() {
		int value=0;
		switch(operation){
		
		case ADD:
			value=leftExpression.evaluate() + rightExpression.evaluate();
			break;
		case SUBTRACT:
			value=leftExpression.evaluate() - rightExpression.evaluate();
			break;
		case MULTIPLY:
			value=leftExpression.evaluate() * rightExpression.evaluate();
			break;
		case DIVIDE:
			value=leftExpression.evaluate() / rightExpression.evaluate();
			break;
			
		}
		return value;
	}

}
