package com.jspider.methodoverloading;
class Person{
	void eat(int a, String s) {
		System.out.println("Veg");
	}
	void eat( String s,int a) {
		System.out.println("Non Veg");
	}
	
}
public class MainClass3 {
	public static void main(String[] args) {
		Person obj=new Person();
		obj.eat(3, "ajaja");
		obj.eat("aman", 3);
	}
}
