class NpowerP
{
	static int power(int n,int p)
	{
		int res=1;
		for(int i=0;i<p;i++)
		{
			res=res*n;
		}
		return res;
	}
	public static void main(String[] args)
	{
		int n=5;
		int p=3;
		System.out.println(power(n,p));
	}
}