package H.InterpreterDesinPattern;

public class MultiplyNonTerminalExpression implements IAbstractExpression {

	IAbstractExpression leftExpression;
	IAbstractExpression rightExpression;

	MultiplyNonTerminalExpression(IAbstractExpression leftExpression, IAbstractExpression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public int interpret(Context context) {
		return leftExpression.interpret(context) * rightExpression.interpret(context);
	}

}
