package com.jspider.passingandreturningobject;
import java.util.Scanner;
public class Bank {
	static void displayAccountInfo(Account a)
	{
		if(a!=null)
		{
			System.out.println("Account Number : "+a.accNum);
			System.out.println("Account Balance : "+a.accBal);
		}
	}
	static Account createAccount()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Account Number : ");
		long accNum=scn.nextLong();
		System.out.println("Enter the Account Balance : ");
		Double accBal=scn.nextDouble();
		
		Account a=new Account(accNum,accBal);
		return a;
	}

}
