class Example
{
	int x;
	double y;
	char c;
	
	{
		x=10;
		y=4.5;
		c='J';
	}

	public static void main(String[] args)
	{
		System.out.println("Program Start");
		Example ref=new Example();
		System.out.println(ref.x);
		System.out.println(ref.y);
		System.out.println(ref.c);
		System.out.println("Program Ends");
	}
	
}