class Program2
{
	public static void main(String[] args)
	{
		int Choice =2;

		switch(Choice)
		{
		case 1: 
		System.out.println("Withdrawl");
		break;

		case 2: 
		System.out.println("Balance Enquiry");
		break;

		case 3: 
		System.out.println("PIN Change");
		break;

		case 4: 
		System.out.println("Mini Statement");
		break;

	default : System.out.println("Invalid Choice");
		}
	}
}