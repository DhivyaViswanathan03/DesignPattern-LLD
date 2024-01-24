package H.InterpreterDesinPattern;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();
// scenario 1
//		Context context = new Context();
//		context.put("a", 2);
//		context.put("b", 3);
//
////		MultiplyNonTerminalExpression multiplyNonTerminalExpression = new MultiplyNonTerminalExpression(
////				new NumberTerminalExpression("a"), new NumberTerminalExpression("b"));

//		System.out.println(multiplyNonTerminalExpression.interpret(context));

		// Scenario 2
		
		context.put("a", 2);
		context.put("b", 4);
		context.put("c", 6);
		context.put("d", 8);
		
		SumNonTerminalExpression sumNonTerminalExpression=new SumNonTerminalExpression(new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")), 
				new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d")));
		System.out.println(sumNonTerminalExpression.interpret(context));
	}

}
