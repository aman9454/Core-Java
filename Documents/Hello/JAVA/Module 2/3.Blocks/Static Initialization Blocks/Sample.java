class Sample
{
	static int x;
	static double y;
	static char c;
	static 
	{
		x=10;
		y=4.5;
		c='J';
	}

	public static void main(String[] args)
	{
		System.out.println("Program Start");
		System.out.println(Sample.x);
		System.out.println(Sample.y);
		System.out.println(Sample.c);
		System.out.println("Program Ends");
	}
	
}