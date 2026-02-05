class DecimalToOctal
{
	static String decToOcta(int dec)
	{
		String Octa="";
		while(dec>0)
		{
			int rem=dec%8;
			dec=dec/8;
			Octa=Octa+rem;
		}
		return Octa;
	}
	public static void main(String[] args)
	{
		int dec=19;
		System.out.println(decToOcta(dec));
	}
}