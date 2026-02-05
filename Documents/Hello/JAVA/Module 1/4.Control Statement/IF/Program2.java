class Program2
{
	public static void main(String[] args )
	{
		double accBal=10000.0;
		int amt=1300;

		if (amt<=accBal)
		{
			System.out.println("Withdrawl Done");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}