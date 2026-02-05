package com.jspider.exceptionhandling;
class Demo
{
	void test()
	{
		System.out.println("Executing test ...");
	}
}
public class MainClass3 {
	public static void main(String[] args) {
		try
		{
			Demo d= (Demo)Class.forName("com.jspider.exceptionhandling.Demo").newInstance();
			d.test();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found");
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Access Denied");
		}
		catch(InstantiationException e)
		{
			System.out.println("Obj creation Failed");
		}
	}

}
