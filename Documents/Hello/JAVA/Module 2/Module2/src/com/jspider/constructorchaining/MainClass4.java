package com.jspider.constructorchaining;
class Student{
	Student(){
		System.out.println("Personal Details");
		System.out.println("Academic Details");
	}
	Student(boolean exp){
		this();
		System.out.println("Experience Details");
	}
}
public class MainClass4 {
	public static void main(String[] args) {
		Student freshers=new Student();
		System.out.println("---------------------");
		Student exp=new Student(false);
	}

}
