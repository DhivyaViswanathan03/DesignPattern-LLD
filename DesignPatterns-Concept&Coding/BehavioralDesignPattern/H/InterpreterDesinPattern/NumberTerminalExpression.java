package H.InterpreterDesinPattern;

public class NumberTerminalExpression implements IAbstractExpression {
	
	String strValue;
	
	NumberTerminalExpression(String strValue){
		this.strValue=strValue;
	}

	@Override
	public int interpret(Context context) {
		return context.getValue(strValue);
	}

}
