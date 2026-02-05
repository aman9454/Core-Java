package com.jspider.wrapperclass;
class Person
{
	int age;
	char gender;
	
	Person(int age, char gender){
		this.age= age;
		this.gender=gender;
	}
}

class Helper
{
	static void display(Person P)
	{
		if(P!=null)
		{
			System.out.println("Age "+ P.age);
			System.out.println("Gender "+ P.gender);
		}
	}
	static Person create()
	{
		int age;
		char gender;
		Person P=new Person(25,'M');
		
		return P;
	}
}

public class MainClass4
{
	public static void main(String[] args) {
		Person p1=Helper.create();
		Helper.display(p1);
		
	}
}