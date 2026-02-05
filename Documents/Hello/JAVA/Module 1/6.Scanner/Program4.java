import java.util.Scanner;

class Program4
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter age");
		int a=scn.nextInt();
		System.out.println("Enter Height");
		float f=scn.nextFloat();
		System.out.println("Enter Mobile Number ");
		long n=scn.nextLong();
		System.out.println("Age : "+a);
		System.out.println("Height : "+f);
		System.out.println("Mobile No. "+n);
	}
}