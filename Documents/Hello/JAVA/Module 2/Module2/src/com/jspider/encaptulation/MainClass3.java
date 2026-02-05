package com.jspider.encaptulation;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		acc.setAccountBalance(25344.3);
		acc.setAccountNumber(233424424l);
		
		System.out.println(acc.getAccountBalance());
		System.out.println(acc.getAccountNumber());
		

	}

}
