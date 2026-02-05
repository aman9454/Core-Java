class ArmstrongNo 
{
	static int count(int n)
	{
		int c=0;
		while(n>0)
		{
			int rem=n%10;
			c++;
			n=n/10;
		}
		return c;
	}
	static int power(int a, int b)
	{
		int prod=1;
		for(int i=1;i<=b;i++)
		{
			prod=prod*a; //////////////////
		}
		return prod;
	}
	static boolean armstrong(int n,int c)
	{
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int rem=n%10;
			int p=power(rem,c);
			sum=sum+p;
			n=n/10;
		}
		return sum==temp;
	}
	public static void main(String[] args)
	{
		int n=153;
		int c=count(n);
		System.out.println(armstrong(n,c));
	}
}