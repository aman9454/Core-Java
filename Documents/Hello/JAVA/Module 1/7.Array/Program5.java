class Program5
{
	public static void main(String[] args)
	{
		int[] arr={15,16,14,12,13,17};

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0 || arr[i]%3==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}