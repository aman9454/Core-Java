class NestedIf3
{
	public static void main(String[] args)
	{
		char gender='F';
		int age= 10;

		if (gender=='M')
		{
			if(age>=21)
			{
				System.out.println("Eligible Bachlor");
			}
			else 
			{
				System.out.println("Boys Underage");
			}
		}
		else if(gender=='F')
			{
			if(age>=18)
			{
				System.out.println("Eligible Spinster");
			}
			else 
			{
				System.out.println("Girl Underage");
			}
		}
		else{
			System.out.println("Invalid Gender");
		}
	}
}