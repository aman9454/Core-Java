class Program18
{
	static boolean perfect(int num)
	{
		int a=1;
		int sum=0;
		
		while(a <= num/2)
		{
			if(num%a==0)
			{
				sum=sum+a;
			}
			
			a++;
		}
		if (num==sum)
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
		boolean status= perfect(3);
		System.out.println(status);

		}
}

