package com.jspider.passingandreturningobject;

public class Helper {
	static void display(Person p)
	{
		if(p!=null)
		{
			System.out.println("Age : "+p.age);
			System.out.println("Gender : "+p.gender);
		}
	}
	static Person create()
	{
		int age=25;
		char gender='M';
		Person p =new Person(age,gender); 
		return p;
	}

}
