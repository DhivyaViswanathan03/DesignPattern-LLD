package E.SingletonDesignPattern.Eagar;

public class DBConnection {
	
	public static DBConnection conObject=new DBConnection(); 
	
	private DBConnection() {
		
	}
	
	public static DBConnection getInstance()
	{
		return conObject;
	}

}
