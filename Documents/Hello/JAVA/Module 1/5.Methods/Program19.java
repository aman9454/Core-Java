class Program19
{
	static void display(int n)
	{
		System.out.println(n+ " ");
		if(n<5)
		{
			n++;
			display(n);
		}
	}
	public static void main (String[] args)
	{
		display(1);
	}
}