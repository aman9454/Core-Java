package com.jspider.methodoverloading;
class Flipkart{
	void payment() {
		System.out.println("COD");
	}
	void payment(String upi) {
		System.out.println("UPI");
	}
	void payment(long card) {
		System.out.println("Card");
	}
	void payment(String un,String pw) {
		System.out.println("NetBanking");
	}
}
public class Mainlass4 {
	public static void main(String[] args) {
		Flipkart ref=new Flipkart();
		ref.payment();
		ref.payment(26738632767836276l);
		ref.payment("Gpay");
		ref.payment("scoott", "tiger");
	}

}
