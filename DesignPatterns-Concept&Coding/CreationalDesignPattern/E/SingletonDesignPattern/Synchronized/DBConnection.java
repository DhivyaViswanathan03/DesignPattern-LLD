package E.SingletonDesignPattern.Synchronized;

public class DBConnection {
	
	public static DBConnection conObject; 
	
	private DBConnection() {
		
	}
	
	synchronized public static DBConnection getInstance()
	{
		if(conObject==null) {
			System.out.println("DBConnection.getInstance()");
			conObject=new DBConnection();
		}
		return conObject;
	}

}
