class DecimalToBinary
{
	public static void main(String[] args)
	{
		int dec=19;
		System.out.println(decToBin(dec));
	}
	static String decToBin(int dec)
	{
		String bin="";
		while(dec>0)
		{
			int rem=dec%2;
			bin=bin+rem;
			dec=dec/2;
		}
		return bin;
	}
}