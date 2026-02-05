package com.jspider.upcasting;
class A
{
	void test()
	{
		System.out.println("Executing test().....");
	}
}
class B extends A
{
	void disp()
	{
		System.out.println("Executing disp().....");
	}
}
class C extends B
{
	void play()
	{
		System.out.println("Executing play().....");
	}
}
public class MainClass4 {
	public static void main(String[] args) {
		C c1=new C();
		c1.play();
		c1.test();
		c1.disp();
		
		B b1=c1;
		b1.test();
		b1.disp();
		
		A a1=b1;
		a1.test();
		
		A a2=c1;
		a2.test();
	}

}




