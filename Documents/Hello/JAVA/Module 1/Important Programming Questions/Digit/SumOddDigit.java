class SumOddDigit
{
	public static void main(String[] args)
	{
		int n=125638;
		System.out.println(SumOddDigit(n));
	}
	static int SumOddDigit(int n)
	{
		int sum=0;
		while(n>0)
		{
			int ref=n%10;
			if(ref%2!=0)
			{
				sum=sum+ref;
			}
			n=n/10;
		}
		return sum;
	}
}