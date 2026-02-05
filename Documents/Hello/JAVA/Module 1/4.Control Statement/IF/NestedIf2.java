class NestedIf2
{
	public static void main(String[] args)
	{
		double accBal=10000000.0;
		int amt=1000;

		if(amt<=accBal)

		{	
			if (amt %100==0)
				{
					System.out.println("Withdrawl Success");
				}
			else 
				{
					System.out.println("INvalid Denomination");

				}

		}

		else if(amt>=20000)
		{

			if
			{
				System.out.println("Invalid Denomination");
			}
			else
			{
				System.out.println("Insufficient");
			}
		}
	}
}