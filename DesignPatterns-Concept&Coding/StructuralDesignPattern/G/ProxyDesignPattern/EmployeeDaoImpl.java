package G.ProxyDesignPattern;

public class EmployeeDaoImpl implements IEmployeeDao {

	@Override
	public void create(String client, EmployeeDO obj) {
		System.out.println("EmployeeDaoImpl.create()");
	}

	@Override
	public void delete(String client, Integer eid) {
		System.out.println("EmployeeDaoImpl.delete()");

	}

	@Override
	public EmployeeDO get(String client, Integer eid) {
		System.out.println("EmployeeDaoImpl.get()");
		return new EmployeeDO();
	}

}
