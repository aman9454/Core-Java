class Program3
{
	public static void main (String[] args)
	{
		char[] ch={'T','g','e','S'};

		for(int i=ch.length-1; i>=0 ; i--)
		{
			System.out.println("Reverse Value "+ch[i]);
		}

		for(int j=0; j<ch.length ; j++)
		{
			System.out.println("Correct Value "+ch[j]);
		}
	}
}