package com.jspider.encaptulation;

public class Water {
	private static int a=10;
	static int b=20;
	protected static int c=30;
	public static int d=40;
	
	public static void main(String[] args) {
		System.out.println(Water.a);
		System.out.println(Water.b);
		System.out.println(Water.c);
		System.out.println(Water.d);
	}
}
