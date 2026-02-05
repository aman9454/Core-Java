package com.jspider.examples;
class Patient{
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("Tata Bye Bye....");
	}
}

public class Equals4 {
	public static void main(String[] args) {
		Patient ref =new Patient();
		System.gc();
		
		ref=null;
		System.gc();
	}

}
