class SumDigit
{
	static int SumDigit(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;

	}
	public static void main(String[] args)
	{
		int num=234;
		System.out.println(SumDigit(num));
	}
}