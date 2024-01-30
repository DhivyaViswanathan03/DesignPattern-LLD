package G.ProxyDesignPattern;

public class EmployeeDO {
	String ename;
	Integer eid;
	String eaddress;
	String email;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmployeeDO [ename=" + ename + ", eid=" + eid + ", eaddress=" + eaddress + ", email=" + email + "]";
	}

}
