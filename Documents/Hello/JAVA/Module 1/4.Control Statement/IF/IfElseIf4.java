class IfElseIf4
{
	public static void main(String[] args)
	{
		double percentage=40.0;

		if(percentage>80.0)
		{
			System.out.println("First Class");
		}
		else if(percentage>=60 && percentage<=80)
		{
			System.out.println("Second Class");
		}
		else if(percentage<60 && percentage>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}