package com.jspider.exceptionhandling;

public class MAinClass2 {
	public static void main(String[] args) {
		String str=null;
		
		try {
			System.out.println(str.charAt(2));
		}
		catch(NullPointerException e)
		{
			System.out.println("Operation with nulll");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Index");
		}
	}

}
