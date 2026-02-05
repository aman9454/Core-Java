package com.jspider.examples;

public class CreditCard {

	int cvv;
	long cardNum;
	
	public static void main(String[] args) throws CloneNotSupportedException{
		CreditCard original=new CreditCard();
		original.cardNum=3673267326l;
		original.cvv=6326;
		
		CreditCard cc = (CreditCard)original.clone();
		System.out.println(cc.cardNum);
		System.out.println(cc.cvv );
				
	}

}
