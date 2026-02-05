package com.jspider.upcasting;
class Demo
{
	
}
class Sample extends Demo
{
	
}
public class MainClass1 {
	public static void main(String[] args) {
	Sample ref=new Sample();
	Demo obj=ref;
	System.out.println(ref);
	System.out.println(obj);
	}
}
