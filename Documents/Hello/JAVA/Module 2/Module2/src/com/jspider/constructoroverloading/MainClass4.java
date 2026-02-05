package com.jspider.constructoroverloading;

class Amazon{
	Amazon(){
		System.out.println("Initialize Shoping");
	}
	Amazon(double fees){
		System.out.println("Initialize Shoping");
		System.out.println("Initialize Prime Video");
		System.out.println("Initialize Amazon Music");
	}
}
public class MainClass4 {
	public static void main(String[] args)
	{
		Amazon a1=new Amazon();
		System.out.println("-------------------");
		Amazon a2=new Amazon(1499.0);
		
	}

}
