class Program13
{
	static boolean verify(int a)
	{
		if(a%2==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		boolean flag=verify(20);
		System.out.println("Return : "+flag);
	}
}