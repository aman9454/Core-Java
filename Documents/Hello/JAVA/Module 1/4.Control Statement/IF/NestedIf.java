class NestedIf
{
	public static void main(String[] args)
	{
		int n=2;

		if(n%2==0)
		{
			if(n<10)
			{
				System.out.println("Pani Puri");
			}
			else 
			{
				System.out.println("Sev Puri");
			}
		}
		else
		{
			if(n<10)
			{
				System.out.println("Bhel Puri");
			}
			else 
			{
				System.out.println("Masala Puri");
			}
		}
	}
}