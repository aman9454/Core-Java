package com.jspider.passingandreturningobject;

public class MainClass3 {
	public static void main(String[] args)
	{
		Account a1=Bank.createAccount();
		Bank.displayAccountInfo(a1);
		
		Account a2=Bank.createAccount();
		Bank.displayAccountInfo(a2);
	}

}
