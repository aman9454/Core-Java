class Program15
{
	static int square(int num)
	{
		int res=num * num;
		return res;
	}
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" Square is "+square(i));
		}

	}
}