class BiggestElement
{
	public static void main(String[] args)
	{
		int a[]={1,2,3,4,566,6,5,88,34,322};
		int large=a[0];
		int x=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(large<a[i])
			{
				large=a[i];
				x=i;
			}
		}
		System.out.println(large);
		System.out.println(x);
	}
}