class Program17
{
	static boolean prime(int num)
	{
		int a=1;
		int count=0;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				count++;
			}
			a++;
			
		}
		if(count==1)
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
		// for(int x=1; x<=100; x++)
		// {
		// 	boolean result=prime(x);
		// 	if(result==true)
		// 	{
		// 		System.out.println("Prime no is "+x);
		// 	}
		// }
		boolean result=prime(13);
		System.out.println(result);
	}
}