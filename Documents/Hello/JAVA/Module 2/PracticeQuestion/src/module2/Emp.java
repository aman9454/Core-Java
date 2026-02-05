package module2;

public class Emp {
	int id;
	String ename;
	double sal;
	
	public Emp(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", ename=" + ename + ", sal=" + sal + "]";
	}

	public Emp setId(int id) {
		this.id = id;
		return this;
	}

	public Emp setEname(String ename) {
		this.ename = ename;
		return this;
	}

	public Emp setSal(double sal) {
		this.sal = sal;
		return this;
	}
	
	
}
