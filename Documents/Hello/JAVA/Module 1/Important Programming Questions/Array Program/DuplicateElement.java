class DuplicateElement
{
	public static void main(String[] args)
	{
		int a[]={10,30,50,20,50,3,65,70,80,3,10,30,30};
		boolean b[]=new boolean[a.length];
		int uniquecount=0;
		int m=2;
		for(int i=0;i<=a.length-1;i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<=a.length-1;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						b[j]=true;
					}
				}
				if(count==1)
				{
					uniquecount++;
					if(uniquecount==m){
					System.out.println(a[i]);
					break;
					}
					
				}
				
			}
		}

	}
}