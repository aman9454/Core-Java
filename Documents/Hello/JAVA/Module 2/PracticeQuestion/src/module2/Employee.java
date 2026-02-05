package module2;

public class Employee {
	int eid;
	String ename;
	int esal;
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
	public Employee setEid(int eid) {
		this.eid = eid;
		return this;
	}
	
	public Employee setEname(String ename) {
		this.ename = ename;
		return this;
	}

	public Employee setEsal(int esal) {
		this.esal = esal;
		return this;
	}
	
	

}
