package com.jspider.examples;

public class Clone implements Cloneable
{
	int hiScore=0;
	
	public static void main(String[] args) throws CloneNotSupportedException{
		Clone ref=new Clone();
		ref.hiScore=5000;
		
		Clone copy = (Clone)ref.clone();
		System.out.println(copy.hiScore);
				
	}
}
