package G.ProxyDesignPattern;

public interface IEmployeeDao {
	
	void create(String client ,EmployeeDO obj) throws Exception;
	void delete(String client ,Integer eid) throws Exception;
	EmployeeDO get(String client ,Integer eid) throws Exception;

}
