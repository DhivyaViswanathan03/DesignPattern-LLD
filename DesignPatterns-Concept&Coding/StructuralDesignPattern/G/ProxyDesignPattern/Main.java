package G.ProxyDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		IEmployeeDao dao=new EmployeeProxyDaoImpl( );
		try {
			dao.create("USER", new EmployeeDO());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
