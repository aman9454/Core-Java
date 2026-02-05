class IfElseIf3
{
	public static void main(String[] args)
	{
		int age=61;

		if(age<=3)
		{
			System.out.println("Free Ticket");
		}
		else if(age>3 && age<=10)
		{
			System.out.println("HAlf Ticket");
		}
		else if(age>10 && age<=60)
		{
			System.out.println("Full Ticket");
		}
		else
		{
			System.out.println("Concession Ticket");
		}
	}
}