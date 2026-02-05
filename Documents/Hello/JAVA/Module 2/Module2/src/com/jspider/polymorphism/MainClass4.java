package com.jspider.polymorphism;

public class MainClass4 {
	public static void main(String[] args) {
		FrontendDeveloper f= new FrontendDeveloper();
		Manager.review(f);
		
		BackendDeveloper b= new BackendDeveloper();
		Manager.review(b);
		
		Developer d=new Developer();
		d.coding();
	}

}
