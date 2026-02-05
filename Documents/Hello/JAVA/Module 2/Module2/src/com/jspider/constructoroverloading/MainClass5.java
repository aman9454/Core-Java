package com.jspider.constructoroverloading;

class Employee
{
	Employee(double ctc) {
		System.out.println("Software Assistance");
	}
	Employee(double ctc, double bonus) {
		System.out.println("Lead Associate");
	}
	Employee(double ctc, double bonus, double benefits) {
		System.out.println("Manager");
	}
}
public class MainClass5 {
	 public static void main(String[] args)
	 {
		 Employee e1=new Employee(4.5);
		 Employee e2=new Employee(6.5,3.0);
		 Employee e3=new Employee(10,4.5,5.4);
		 
	 }
}
