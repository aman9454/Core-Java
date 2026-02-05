class StrongNo
{
	static boolean strongNo(int n)
	{
		int temp=n;
		int sum=0;
		int prod=1;
		while(n>0)
		{
			int rem=n%10;
			for(int i=rem;i>=1;i--)
			{
				prod=prod*i;
			}
			sum=sum+prod;
			prod=1;
			n=n/10;
		}
		return sum==temp;
	}
	public static void main(String[] args)
	{
		for(int i=1;i<=1000;i++)
		{
			boolean res=strongNo(i);
			if(res)
			System.out.println(i);
		}
		
	}	
}