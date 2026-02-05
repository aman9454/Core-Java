package com.jspider.constructorchaining;

class Helper
{
	Helper()
	{
		System.out.println("Helper() Constructor ");
	}
	Helper(int a)
	{
		this();
		System.out.println("Helper(int) Constructor ");
	}
	
}
public class Mainclass1 {
	public static void main(String[] args) {
		Helper obj=new Helper(22);
	}

}
