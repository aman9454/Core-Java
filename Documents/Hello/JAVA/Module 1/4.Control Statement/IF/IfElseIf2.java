class IfElseIf2
{
	public static void main(String[] args)
	{
		int n= 15;

		if(n%2==0 && n%3==0)
		{
			System.out.println("Bangalore");
		}
		else if(n%2==0)
		{
			System.out.println("Channai");
		}
		else if(n%3==0)
		{
			System.out.println("Gorakhpur");
		}
		else 
		{
			System.out.println("Bangal");
		}
	}
}