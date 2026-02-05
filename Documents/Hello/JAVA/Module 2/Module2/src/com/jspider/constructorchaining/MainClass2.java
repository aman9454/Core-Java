package com.jspider.constructorchaining;
class Utility
{
	Utility(int arg){
		System.out.println("Utility ( int ) Constructor");
	}
	Utility(double arg){
		System.out.println("Utility ( double ) Constructor");
	}
	Utility(String arg){
		this(2);
		System.out.println("Utility( String ) Constructor");
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		Utility obj=new Utility("ABC");
	}

}
