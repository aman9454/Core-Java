class Program8
{
	public static void main(String[] args)
	{
		int[] arr={12,14,13,17,11,16};
		int large = arr[0];

		for(int i=1; i<arr.length; i++)
		{
			if(large<arr[i])
			{
				large=arr[i];
			}
		}
		System.out.println("Largest value " +large);
	}
}