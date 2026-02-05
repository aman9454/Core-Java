class Beta
{
	char ch;
	 
	{
		ch='A';
		System.out.println("Execution Non Static Block...");
	}

	public static void main(String[] args)
	{
		System.out.println("Program Start");
		Beta ref=new Beta();
		System.out.println(ref.ch);
		System.out.println(ref.ch);
		System.out.println("Program Ends");
	}
	
}