package com.jspider.pureabstraction;

interface Demo
{
	void test();
	
}
class Sample implements Demo
{
	@Override
	public void test() {
		System.out.println("Executing test() ....");
	}
}
public class MainClass1 {
	public static void main(String[] args) {
		Demo ref=new Sample();
		ref.test();
	}

}
