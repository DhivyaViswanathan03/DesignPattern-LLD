package D.ChainOfResponsibilityDesignPattern;

public class DebugLogProcessor extends ALogProcessor {

	public DebugLogProcessor(ALogProcessor logProcessor) {
		super(logProcessor);
	}
	
	public void log(int logLevel,String msg) {
		if(logLevel==DEBUG) {
			System.out.println("DEBUG"+" "+msg);
		}else {
			super.log(logLevel, msg);
		}
	}


}
