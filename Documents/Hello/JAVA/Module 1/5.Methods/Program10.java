class Program10
{
	static int test()
	{
		return 25;
	}
	public static void main(String[] args)
	{
		int val=test();
		System.out.println("Return value : "+val);
		System.out.println("Returned value : "+test());
	}
}