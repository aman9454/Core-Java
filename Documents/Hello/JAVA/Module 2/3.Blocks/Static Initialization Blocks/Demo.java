class Demo
{
	static int x;
	static 
	{
		x=10;
	}

	public static void main(String[] args)
	{
		System.out.println("Program Start");
		System.out.println(Demo.x);
		System.out.println("Program Ends");
	}
	
}