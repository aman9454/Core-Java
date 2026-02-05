class Program14
{
	public static void main (String[] args)
	{
		int a=1;
		int num=15;
		int count=0;
		
		while(a<=num/2)
		{
			if(num%a==0)
			{
				count++;
			}
			a++;
		}
		if(count==1){
			System.out.println(num + " is a prime no");
		}
		else {
            System.out.println(num + " is a not prime no");
		}
	}
}