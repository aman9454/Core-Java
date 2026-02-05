package com.jspider.downcasting;

public class MainClass4 {
	public static void main(String[] args) {
		Developer d=new Developer();
		Manager.review(d);
		
		Tester t= new Tester();
		Manager.review(t);
	}

}
