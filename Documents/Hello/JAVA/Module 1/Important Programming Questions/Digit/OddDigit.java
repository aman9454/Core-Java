class OddDigit
{
	public static void main(String[] args)
	{
		int n=2345;
		System.out.println(OddDigit(n));
	}
	static int OddDigit(int n)
	{
		int count=0;
		while(n>0)
		{
			int ref=n%10;
			if(ref%2!=0)
			{
			count++;	
			}
			n=n/10;

		}
		return count;
	}
}