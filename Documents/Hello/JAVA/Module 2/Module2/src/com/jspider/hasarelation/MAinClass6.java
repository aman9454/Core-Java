package com.jspider.hasarelation;
class Account {
	void withdraw() {
		System.out.println("Withdraw from acc. ");
	}
	void deposit() {
		System.out.println("Deposit to acc. ");
	}
}
class Customer{
	Account acc= new Account();
}
class Bank{
	Customer cu;
	Bank(Customer cu){
		this.cu=cu;
	}
}
public class MAinClass6 {

	public static void main(String[] args) {
		Customer c=new Customer();
		Bank sbi=new Bank(c);
		Bank icici=new Bank(c);
		
		icici.cu.acc.withdraw();
		sbi.cu.acc.deposit();

	}

}
