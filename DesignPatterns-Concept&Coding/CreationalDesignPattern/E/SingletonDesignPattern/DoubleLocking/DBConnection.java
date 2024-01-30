package E.SingletonDesignPattern.DoubleLocking;

public class DBConnection {
	
	public static DBConnection conObject; 
	
	private DBConnection() {
		
	}
	
	public static DBConnection getInstance()
	{
		if(conObject==null) {
			synchronized (DBConnection.class) {
				if(conObject==null) {
					System.out.println("DBConnection.getInstance()");
					conObject=new DBConnection();
				}
			}
		}
		return conObject;
	}

}
