package com.jspider.partialabstraction;

public class MainClass1 {
	public static void main(String[] args) {
		Hotstarfree free=new Hotstarfree();
		ContentManager.control(free);
		System.out.println("_____________________");
		
		HotstarVip vip=new HotstarVip();
		ContentManager.control(vip);
		System.out.println("_____________________");
		
		HotstarPremium pre=new HotstarPremium();
		ContentManager.control(pre);
		System.out.println("_____________________");
	}

}
