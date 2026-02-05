package com.jspider.hasarelation;
class Printer{
	void print() 
	{
		System.out.println("Printer is Printing");
	}
	void print(String s) 
	{
		System.out.println("Printer is Printing "+s);
	}
	void print(int a ) 
	{
		System.out.println("Printer is Printing "+a);
	}
}
class Computer{
	static Printer out=new Printer();
	static {
		out=new Printer();
	}
	
}
public class MainClass7 {
	public static void main(String[] args) {
		Computer.out.print();
		Computer.out.print("Java");
		Computer.out.print(33);
	}

}
