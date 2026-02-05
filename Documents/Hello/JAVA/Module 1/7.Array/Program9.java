class Program9
{
	public static void main(String[] args)
	{
		int[] arr={12,14,13,17,11,16};
		int small = arr[0];

		for(int i=1; i<arr.length; i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
			}
		}
		System.out.println("Smallest value " +small);
	}
}