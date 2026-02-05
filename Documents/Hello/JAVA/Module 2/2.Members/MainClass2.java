class Demo
{
	static int a=100;
	static double b=7.5;
	static void test()
	{
		System.out.println("Executing test()....");
	}
	static void help()
	{
		System.out.println("Executing help()....");
	}
}
public class MainClass2
{
	public static void main(String[] args)
	{
		System.out.println(Demo.a);
		System.out.println(Demo.b);
		Demo.test();
		Demo.help();
	}
}