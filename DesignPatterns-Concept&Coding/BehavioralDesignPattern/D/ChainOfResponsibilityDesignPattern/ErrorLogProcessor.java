package D.ChainOfResponsibilityDesignPattern;

public class ErrorLogProcessor extends ALogProcessor {

	public ErrorLogProcessor(ALogProcessor logProcessor) {
		super(logProcessor);
	}
	
	public void log(int logLevel,String msg) {
		if(logLevel==ERROR) {
			System.out.println("ERROR"+" "+msg);
		}else {
			super.log(logLevel, msg);
		}
	}


}
