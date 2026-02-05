class Demo
{
	static int a=100;
	static void test()
	{
		System.out.println("Executing test()....");
	}
}
public class MainClass1
{
	public static void main(String[] args)
	{
		System.out.println(Demo.a);
		Demo.test();
	}
}