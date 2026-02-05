package com.jspider.exceptionhandling;

public class mainClass1 {
	public static void main(String[] args) {
		System.out.println("Program Start");
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("/By Zero");
		}
		System.out.println("Program Ends");
	}

}
