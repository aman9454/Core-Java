class Account
{
	long accNum;
	double accBal;

	void withdraw(double amt)
	{
		accBal=accBal-amt;
		System.out.println("Withdrawl from "+accNum+" success");
		System.out.println("Avaliable Balance "+accBal);
	}
	void deposit(double amt)
	{
		accBal=accBal+amt;
		System.out.println("Deposit to "+accNum+" success");
		System.out.println("Avaliable Balance "+accBal);
	}
}
public class MainClass5{

public static void main(String[] args)
{
	Account a1=new Account();
	a1.accNum=27267637636L;
	a1.accBal=10000;

	a1.withdraw(2000);
	a1.deposit(500);

	System.out.println("-------------------");

	Account a2=new Account();
	a2.accNum=6363648382L;
	a2.accBal=150344;
	a2.withdraw(2034);
	a2.deposit(300);
}
 }