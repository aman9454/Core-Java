package com.jspider.inheritance;
class Alpha 
{
	void help()
	{
		System.out.println("Executing help()....");
	}
}
class Beta extends Alpha
{
	void play()
	{
		System.out.println("Executing play()....");	
	}
}
public class MainClass2 {
	public static void main(String[] args) {
	Alpha ref=new Alpha();
	ref.help();
	
	Beta obj=new Beta();
	obj.help();
	obj.play();
	}
}
