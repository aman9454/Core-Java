class Student
{
	int id;
	double cgpa;

	void write()
	{
		System.out.println(id+" is writing");
	}
	void listen()
	{
		System.out.println("Student is having CGPA : "+cgpa);
	}
}
public class MainClass1{

public static void main(String[] args)
{
	Student s1=new Student();
	s1.id=101;
	s1.cgpa=7.6;

	s1.write();
	s1.listen();
	System.out.println("-------------------");

	Student s2=new Student();
	s2.id=102;
	s2.cgpa=8.6;

	s2.write();
	s2.listen();
}
}