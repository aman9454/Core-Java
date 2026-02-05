import java.util.Scanner;

class Program2
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=scn.nextInt();
		if(num%2==0)
		{
			System.out.println("Even No. ");
		}
		else{
			System.out.println("Odd No. ");
		}
	}
}