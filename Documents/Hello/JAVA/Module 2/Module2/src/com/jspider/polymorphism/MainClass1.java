package com.jspider.polymorphism;
class Flipkart{
	void payment() {
		System.out.println("COD");
	}
	void payment(long card) {
		System.out.println("CARD : 10% Discount");
	}
	void payment(String upi) {
		System.out.println("UPI : Cashback");
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flipkart ref=new Flipkart();
		ref.payment();
		ref.payment(2767862372l);
		ref.payment("aman@sbi");

	}

}
