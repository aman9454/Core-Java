class Searching
{
	public static void main(String[] args)
	{
		int[] arr={21,22,25,28,29,32};
		int element=24;
		boolean flag=false;

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==element)
			{
				System.out.println(element+" found at index "+i);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println(element+" not found in array");
		}
	}
}