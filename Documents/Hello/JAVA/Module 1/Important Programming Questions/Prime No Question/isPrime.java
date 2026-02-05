class isPrime
{
	static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2; i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		int n=6;
		boolean res=isPrime(n);

		if(res==true)
		{
			System.out.println("Prime no.");
		}
		else
		{
			System.out.println("Not Prime no.");
		}
	}
}