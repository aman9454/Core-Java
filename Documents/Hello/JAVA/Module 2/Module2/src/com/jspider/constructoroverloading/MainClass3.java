package com.jspider.constructoroverloading;

class SoftwareEngineer{
	SoftwareEngineer(int a, String s)
	{
		System.out.println("Developer");
	}
	SoftwareEngineer(String s,int a)
	{
		System.out.println("Tester");
	}
}

public class MainClass3 {
	public static void main(String[] args)
	{
		SoftwareEngineer sde=new SoftwareEngineer(10,"Jspider");
		SoftwareEngineer sdet=new SoftwareEngineer("Qspider",10);
	}
	

}
