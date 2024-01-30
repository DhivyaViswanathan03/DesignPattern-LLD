package G.ProxyDesignPattern;

public class EmployeeProxyDaoImpl implements IEmployeeDao {
	
	IEmployeeDao daoObj;
	
	public EmployeeProxyDaoImpl() {
		daoObj=new EmployeeDaoImpl();
	}

	@Override
	public void create(String client, EmployeeDO obj) throws Exception {
		if(client.equalsIgnoreCase("ADMIN")) {
			daoObj.create(client, obj);
			return;
		}
		throw new Exception("Access Denied");

	}

	@Override
	public void delete(String client, Integer eid) throws Exception {
		if(client.equalsIgnoreCase("ADMIN")) {
			daoObj.delete(client, eid);
			return;
		}
		throw new Exception("Access denied");

	}

	@Override
	public EmployeeDO get(String client, Integer eid) throws Exception {
		if(client.equalsIgnoreCase("ADMIN") || client.equalsIgnoreCase("USER")) {
			EmployeeDO doObject = daoObj.get(client, eid);
			return doObject;
		}
		throw new Exception("Access denied");
	}

}
