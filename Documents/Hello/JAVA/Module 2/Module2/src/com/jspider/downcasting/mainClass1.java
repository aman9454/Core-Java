package com.jspider.downcasting;
class Demo
{
	
}
class Sample extends Demo{
	
}
public class mainClass1 {
	public static void main(String[] args) {
		Demo ref=new Sample();
		Sample obj=(Sample)ref;
		System.out.println(ref);
		System.out.println(obj);
	}
		

}
