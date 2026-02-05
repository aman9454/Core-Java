package com.jspider.inheritance;
class Whatsapp1
{
	void message(){
		System.out.println("Messaging in Whatsapp ");
	}
}
class Whatsapp2 extends Whatsapp1{
	void Calling() {
		System.out.println("Calling in Whatsapp ");
	}
}
class Whatsapp3 extends Whatsapp2{
	void Status() {
		System.out.println("Status in Whatsapp ");
	}
}
public class MainClass4 {
	public static void main(String[] args) {
		Whatsapp3 ref=new Whatsapp3();
		ref.Calling();
		ref.message();
		ref.Status();
		
	}

}
