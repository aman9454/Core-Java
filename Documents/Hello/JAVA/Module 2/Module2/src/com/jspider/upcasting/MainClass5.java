package com.jspider.upcasting;

public class MainClass5 {
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		Flipkart.addToKart(mob);
		
		Television tv=new Television();
		Flipkart.addToKart(tv);
		
		Refrigerator ref=new Refrigerator();
		Flipkart.addToKart(ref);
	}
	

}
