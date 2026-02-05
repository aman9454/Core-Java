// Write a program to calculate SI using given data 
// principle = 10000.0
//rate=11.5
// tenure = 2
// SI (p*t*r)/100

class Program6
{
	public static void main (String[] args)
	{
		double rate = 11.5;
		double principle = 10000.0;
		double tenure =2;
		double SI= (rate*principle*tenure)/100;


		System.out.println("Simple Interest : " + SI);
	}
}