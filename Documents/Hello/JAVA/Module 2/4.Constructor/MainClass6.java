class Employee
{
	int eid;
	double ctc;
	Employee(int arg1 , double arg2)
	{
		eid=arg1;
		ctc=arg2;
	}
}
public class MainClass6
{
	public static void main(String[] args)
	{
		Employee c1=new Employee(101,5.7);
		System.out.println("E_ID : "+c1.eid+" CTC : "+c1.ctc);
		
		Employee c2=new Employee(102,6.7);
		System.out.println("E_ID : "+c2.eid+" CTC : "+c2.ctc);

		Employee c3=new Employee(103,7.2);
		System.out.println("E_ID : "+c3.eid+" CTC : "+c3.ctc);
		
	}
}