package D.ChainOfResponsibilityDesignPattern;

public class Main {

	public static void main(String[] args) {
		ALogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

		logObject.log(ALogProcessor.ERROR, "exception happens");
		logObject.log(ALogProcessor.DEBUG, "need to debug this ");
		logObject.log(ALogProcessor.INFO, "just for info ");

	}

}
