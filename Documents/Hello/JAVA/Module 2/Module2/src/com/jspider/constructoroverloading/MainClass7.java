package com.jspider.constructoroverloading;

class Student
{
	Student() {
		System.out.println("Personal Details");
		System.out.println("Academic Details");
	}
	Student(boolean exp) {
		System.out.println("Personal Details");
		System.out.println("Academic Details");
		System.out.println("Experience Details");
	}
}
public class MainClass7 {
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println("--------   -------------");
		Student s2=new Student(false);
	}
}
