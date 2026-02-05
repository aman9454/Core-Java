class Program12
{
	public static void main (String[] args)
	{
		int a=1;
		int num=3;
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
				System.out.print(num + " is a Perfect Number.");
			}
			else {
				System.out.print(num + " is not Perfect Number.");
			}
		System.out.println(" And the sum of this is "+sum);
		
	}
}