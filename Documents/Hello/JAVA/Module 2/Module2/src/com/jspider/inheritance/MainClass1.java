package com.jspider.inheritance;
class Demo
{
	int val=100;
	void test()
	{
		System.out.println("Executing test().....");
	}
}
class Sample extends Demo
{
	
}
public class MainClass1 {
	public static void main(String[] args)
	{
	Sample obj=new Sample();
	System.out.println(obj.val);
	obj.test(); 
	}
}
