package com.jspider.encaptulation;

public class MainClass2 {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEid(102);
		e.setCtc(2.4);
		
		System.out.println(e.getEid());
		System.out.println(e.getCtc());
		
	}

}
