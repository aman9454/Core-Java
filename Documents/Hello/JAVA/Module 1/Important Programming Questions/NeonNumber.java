class NeonNumber
{
	static boolean neonNum(int n)
	{
		int sum=0;
		int square=n*n;

		while(square>0)
		{
			int ref=square%10;
			// n=n/10;
			sum=sum+ref;
			square=square/10;
		}
		if(sum==n)
			return true;
		else
			return false;
	}
	public static void main(String[] arsg)
	{
		for(int i=1;i<=1000;i++){
			boolean res=neonNum(i);
			if(res)
			System.out.println(i);
		}
	}
}