import java.util.Scanner;

class Program6
{
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter character Value ");
		char ch= scn.next().charAt(0);
		System.out.println("Character : "+ch);
	}
}

//In above Program, we are reading a string type value and extracting the first char from the string value 