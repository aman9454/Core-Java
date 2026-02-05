class SpyNo
{
	static boolean spynum(int n)
	{
		int sum=0;
		int prod=1;

		while(n>0)
		{
			int ref=n%10;
			n=n/10;
			sum=sum+ref;
			prod=prod*ref;
		}
		if(sum==prod)
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		
		for(int i=1;i<=1000;i++){
			boolean res=spynum(i);
			if(res)
			System.out.println(i);
		}
		
	}
}