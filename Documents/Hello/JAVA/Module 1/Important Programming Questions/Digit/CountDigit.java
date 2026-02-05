class CountDigit
{
	public static void main(String[] args)
	{
		int n=23456;
		System.out.println(CountDigit(n));
	}
	static int CountDigit(int n)
	{
		int count=0;

		while(n>0)
		{
			int rem=n%10;
			count++;
			n=n/10;
		}
		return count;
	}
}