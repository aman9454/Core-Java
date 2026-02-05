class ProductDigit
{
	public static void main(String[] ags)
	{
		int n=234;
		System.out.println(ProductDigit(n));
	}
	static int ProductDigit(int n)
	{
		int prod=1;
		while(n>0)
		{
			int rem=n%10;
			prod=prod*rem;
			n=n/10;
		}
		return prod;
	}
}