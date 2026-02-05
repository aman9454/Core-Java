package com.jspider.constructoroverloading;

class Nexon
{
	Nexon(int a) {
		System.out.println("Petrol Varient");
	}
	Nexon(double d) {
		System.out.println("Diesel Varient");
	}
	Nexon(String s) {
		System.out.println("Electric Varient");
	}
	
}
public class MainClass6 {
	public static void main(String[] args)
	{
		Nexon nex1=new Nexon(10);
		Nexon nex2=new Nexon(4.5);
		Nexon nex3=new Nexon("Abc");
	}

}
