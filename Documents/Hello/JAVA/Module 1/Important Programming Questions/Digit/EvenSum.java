class EvenSum
{
	public static void main(String[] args)
	{
		int num=234;
		System.out.println(EvenSumDigit(num));
	}
	static int EvenSumDigit(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			num=num/10;
		}
		return sum;
		
	}
}