package H.InterpreterDesinPattern;

public class SumNonTerminalExpression implements IAbstractExpression {
	
	IAbstractExpression leftExpression;
	IAbstractExpression rightExpression;
	
	SumNonTerminalExpression(IAbstractExpression leftExpression,IAbstractExpression rightExpression){
		this.leftExpression=leftExpression;
		this.rightExpression=rightExpression;
		
	}

	@Override
	public int interpret(Context context) {
		return leftExpression.interpret(context) + rightExpression.interpret(context);
	}

}
