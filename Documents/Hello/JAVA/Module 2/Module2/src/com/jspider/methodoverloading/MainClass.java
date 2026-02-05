package com.jspider.methodoverloading;
class Demo{
	void test(int a) {
		System.out.println("White Box Testing");
	}
	void test(double d) {
		System.out.println("Black Box Testing");
	}
	void test(String s) {
		System.out.println("Grey Box Testing");
	}
}
public class MainClass {
	public static void main(String[] args) {
		Demo ref=new Demo();
		ref.test(7.3);
		ref.test(23);
		ref.test("java");
	}
}
