import java.util.Scanner;

class Program3
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		double num1=scn.nextDouble();
		System.out.println("Enter the Second no.");
		double num2=scn.nextDouble();
		double sum=num1+num2;
		System.out.println("Result : "+sum);

	}
}