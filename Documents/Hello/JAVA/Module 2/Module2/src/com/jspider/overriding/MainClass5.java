package com.jspider.overriding;
class Whatsapp1{
	void deliveryReport() {
		System.out.println("Sent");
	}
}
class Whatsapp2 extends Whatsapp1{
	@Override
	void deliveryReport() {
		System.out.println("Sent-Delivered");
	}
}
class Whatsapp3 extends Whatsapp2{
	@Override
	void deliveryReport() {
		System.out.println("Sent-Delivered-Seen");
	}
}
public class MainClass5 {
	public static void main(String[] args) {
		Whatsapp1 obj=new Whatsapp3();
		obj.deliveryReport();
	}

}
