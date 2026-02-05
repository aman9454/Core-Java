class aaaa 
{
	static int isPrime(int n)
	{
	int count=1;
	int num=0;
	for(int i=2; i<=100;i++)
	{
		for(int j=2; j<=i/2; j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println(i);
			num++;
			if(num==5)
			break;
		}
		count=1;
	}

    }
    public static void main(String[] args)
    {
    	int num=10;
    	isPrime(num);

    }
}
