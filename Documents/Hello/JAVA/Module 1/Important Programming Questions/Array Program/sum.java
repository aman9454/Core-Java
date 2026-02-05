import java.util.Arrays;
class sum
{
	public static void main(String[] args)
	{
		int a[]={2,4,3,5,7,8,1,11,8};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]+a[j]==9 && a[i]!=a[j])
				{
					System.out.println(a[i]+" + "+a[j]);
					// System.out.println(a[j]);
					break;

				}
			}
		}
	}
}