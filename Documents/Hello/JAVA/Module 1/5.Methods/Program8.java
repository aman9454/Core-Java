class Program8
{
	static void substraction(int a, int b )
	{
		int sub= a-b;
		System.out.println(a+" - "+b+" = "+sub);

	}
	static void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println(a+ " + "+b+" = "+sum);
	}
	public static void main(String[] args)
	{
		addition(12,13);
		addition(11,2);
		substraction(11,5);
	}
}