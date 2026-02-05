class Alpha
{
	int num;
	
	{
		num=30;
	}
	
	{
		num=60;
	}
	
	{
		num=90;
	}

	public static void main(String[] args)
	{
		System.out.println("Program Start");

		Alpha ref=new Alpha();
		System.out.println(ref.num);

		System.out.println("Program Ends");
	}
	
}