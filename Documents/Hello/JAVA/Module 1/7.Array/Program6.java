class Program6
{
	public static void main(String[] args)
	{
		int[] arr={10,13,17,16,18,11};

		int sum=0;

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			sum=sum+arr[i];
		}
		System.out.println("Array Sum : "+sum);
	}
}