package com.jspider.methodoverloading;
class Facebook{
	void login(String un, String pwd) {
		System.out.println("Login with userName and pasward");
	}
	void login(long mn, String pwd) {
		System.out.println("Login with MobileNumber and pasward");
	}
}
public class MainClass5 {
	public static void main(String[] args) {
		Facebook ref= new Facebook();
		ref.login(3676236l, "ewut22");
		ref.login("ahgdw", "ywyuq6");
	}
}
