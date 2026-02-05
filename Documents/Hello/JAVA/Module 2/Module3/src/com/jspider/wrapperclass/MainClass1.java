package com.jspider.wrapperclass;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45;
		Integer ref = new Integer(a); //Boxing : int ------> Integer
		System.out.println(ref);
		
		double d =2.3;
		Double val = d; //Boxing : double ----->Double
		System.out.println(val);
		
		char c='J';
		Character obj = c; // Boxing : char ------> Character
		System.out.println(obj);

	}

}
