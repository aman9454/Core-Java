class Program14
{
	static double addition(double n1, double n2)
	{
		double sum= n1+n2;
		return sum;
	}
	public static void main(String[] args)
	{
		double val=addition(12,13);
		
		System.out.println("Return value : "+val);
		System.out.println("Returned value : "+addition(6.3,4.4));
	}
}