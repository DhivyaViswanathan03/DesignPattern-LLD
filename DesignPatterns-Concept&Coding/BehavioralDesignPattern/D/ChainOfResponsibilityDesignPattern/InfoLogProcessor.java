package D.ChainOfResponsibilityDesignPattern;

public class InfoLogProcessor extends ALogProcessor {

	public InfoLogProcessor(ALogProcessor logProcessor) {
		super(logProcessor);
	}
	
	public void log(int logLevel,String msg) {
		if(logLevel==INFO) {
			System.out.println("INFO"+" "+msg);
		}else {
			super.log(logLevel, msg);
		}
	}


}
