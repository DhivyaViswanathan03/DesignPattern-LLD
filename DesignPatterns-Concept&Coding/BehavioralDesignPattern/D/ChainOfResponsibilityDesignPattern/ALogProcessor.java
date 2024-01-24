
package D.ChainOfResponsibilityDesignPattern;

public abstract class ALogProcessor {
	
	public static int INFO=1;
	public static int DEBUG=2;
	public static int ERROR=3;
	
	ALogProcessor nextLevelProcessor;
	
	public ALogProcessor(ALogProcessor logProcessor) {
		if(logProcessor!=null) {
			System.out.println("LogProcessor Impl class is :"+logProcessor.getClass().getName());
		}
		this.nextLevelProcessor=logProcessor;
	}
	
	
	public void log(int logLevel,String message) {
		if(nextLevelProcessor!=null) {
			System.out.println("NextLevelProcessor is:"+nextLevelProcessor.getClass().getName());
			nextLevelProcessor.log(logLevel, message);
		}
	}

}
