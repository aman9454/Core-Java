class Employee
{
	String name;
	double ctc;

	void work()
	{
		System.out.println("Employee is working the name is  "+name);
	}
	void meeting()
	{
		System.out.println("Employee in meeting the CTC is : "+ctc);
	}
}
public class MainClass2{

public static void main(String[] args)
{
	Employee e1=new Employee();
	e1.name="Rama";
	e1.ctc=7.6;

	e1.work();
	e1.meeting();
	System.out.println("-------------------");

	Employee e2=new Employee();
	e2.name="Krishna";
	e2.ctc=8.6;
	e2.work();
	e2.meeting();
}
}