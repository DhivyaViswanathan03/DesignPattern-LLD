package E.SingletonDesignPattern.Lazy;

public class DBConnection {
	
	public static DBConnection conObject; 
	
	private DBConnection() {
		
	}
	
	public static DBConnection getInstance()
	{
		if(conObject==null) {
			System.out.println("DBConnection.getInstance()");
			conObject=new DBConnection();
		}
		return conObject;
	}

}
