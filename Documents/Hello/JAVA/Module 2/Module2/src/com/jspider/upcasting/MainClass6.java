package com.jspider.upcasting;

public class MainClass6 {
	public static void main(String[] args) {
		Apple a=new Apple();
		FruitBasket.addToBasket(a);
		
		Mango m=new Mango();
		FruitBasket.addToBasket(m);
		
		Banana b=new Banana();
		FruitBasket.addToBasket(b);
	}
	
	
}
