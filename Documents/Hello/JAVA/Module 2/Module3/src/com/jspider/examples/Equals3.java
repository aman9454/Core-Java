package com.jspider.examples;
class Account
{
	private long accNum = 122833874l;
	private double accBal = 7384784.44;
	@Override
	public boolean equals(Object obj)
	{
		Account a=(Account)obj;
		if(this.accNum==a.accNum && this.accBal==a.accBal)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
public class Equals3 {
	public static void main(String[] args) {
		Account a1=new Account();
		Account a2=new Account();
		System.out.println(a1.equals(a2));
	}

}
