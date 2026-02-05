package com.jspider.pureabstraction;
interface A
{
	void m1();
}
interface B extends A
{
	void m2();
}
class C implements B
{
	@Override
	public void m2() {
		System.out.println("Executing m2");
		
	}
	@Override
	public void m1() {
		System.out.println("Executing m1");
		
	}
	
}
public class MainClass5 {
	public static void main(String[] args) {
		C ref=new C();
		ref.m1();
		ref.m2();
	}

}
