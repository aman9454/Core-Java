class primeElement
{
	public static void main(String[] args)
	{
		int a[]={21,20,3,7,23,4};
		for(int i =0; i<=a.length-1;i++)
		{
			if(isPrime(a[i]))
			{
				System.out.println(a[i]);
			}
		}
	}
	static boolean isPrime(int n)
	{
		if(n<=1)
		return false;

		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}