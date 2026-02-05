package com.jspider.encaptulation;

public class MainClass4 {
	public static void main(String[] args) {
		Crenditial obj=new Crenditial();
		obj.setPassword("aman");
		obj.setUserName("aman@123");
		
		System.out.println(obj.getPassword());
		System.out.println(obj.getUserName());
	}
}
