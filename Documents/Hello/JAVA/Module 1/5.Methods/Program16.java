class Program16
{
	static int factorial(int n)
	{
		int fact=1;
		while (n>=1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args)
	{
		for(int a=1;a<=5;a++)
		{
			int result=factorial(a);
			System.out.println(a+" factorial is "+result);
		}

	}
}