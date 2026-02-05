class Beta
{
	static int x;
	static 
	{
		x=10;
		System.out.println("Execution Static Block");
	}

	public static void main(String[] args)
	{
		System.out.println("Program Start");
		System.out.println(Beta.x);
		System.out.println("Program Ends");
	}
	
}