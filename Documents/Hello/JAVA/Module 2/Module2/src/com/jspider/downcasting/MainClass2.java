package com.jspider.downcasting;
class Alpha
{
	void play()
	{
		System.out.println("Executing play()....");
	}
	
}
class Beta extends Alpha{
	void test()
	{
		System.out.println("Executing test()....");
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		Alpha ref=new Beta();
		ref.play();
		
		Beta obj=(Beta)ref;
		obj.play();
		obj.test();
	}
		
}