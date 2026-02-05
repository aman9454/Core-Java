class ReverseNo
{
	static int reverse(int n)
	{
		int num=0;
		while(n>0)
		{
			int ref=n%10;
			num=num*10+ref;
			n=n/10;
		}
		return num;
	}
	public static void main(String[] args)
	{
		int n=123442;
		System.out.println(reverse(n));
	}
}