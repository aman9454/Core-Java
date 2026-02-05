package com.jspider.widening;

public class MainClass1 {
	public static void main(String[] args) {
		int a=12;
		double b=a; //Widening int ---> double
		System.out.println(b);
		
		char c='A';
		int d=c; //Widening : char--->int
		System.out.println(d);
		
		float e=2.34f;
		double f=e; //Widening : float--->double
		System.out.println(f);
	}

}
