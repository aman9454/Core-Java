package com.jspider.examples;
class Employee1
{
	int eid=101;
}

class Employee2
{
	int eid=101;
	@Override
	public int hashCode()
	{
		return eid;
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		Employee1 s1=new Employee1();
		System.out.println(s1.hashCode());
		
		Employee2 s2=new Employee2();
		System.out.println(s2.hashCode());
	}

}
