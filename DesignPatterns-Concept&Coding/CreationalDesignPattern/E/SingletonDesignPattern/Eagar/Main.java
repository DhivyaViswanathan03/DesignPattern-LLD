package E.SingletonDesignPattern.Eagar;

public class Main {

	public static void main(String[] args) {
		
		DBConnection connection=DBConnection.getInstance();
		System.out.println(connection.getClass().getName());

	}

}
