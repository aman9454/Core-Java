package com.jspider.partialabstraction;

public class MainClass2 {
	public static void main(String[] args) {
		Samsung s =new Samsung();
		PhoneHelper.show(s);
		System.out.println("___________________");
		
		Vivo v =new Vivo();
		PhoneHelper.show(v);
		System.out.println("___________________");
		
		Oppo o =new Oppo();
		PhoneHelper.show(o);
		System.out.println("___________________");
	}
}
