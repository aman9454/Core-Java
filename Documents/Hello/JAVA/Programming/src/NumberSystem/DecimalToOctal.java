package NumberSystem;

public class DecimalToOctal {
	public static void main(String[] args) {
		int dec=19;
		System.out.println(decToOct(dec));
	}
	
	static String decToOct(int dec)
	{
	String oct="";
	while(dec>0)
	{
		int rem=dec%8;
		dec=dec/8;
		oct=oct+rem;
	}
	return oct;
	}
}
