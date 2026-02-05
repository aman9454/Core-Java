class Delta
{
	int a=50;
	void test()
	{
		System.out.println("Executing test()....");
	}
}
public class NonStatic
{
	public static void main(String[] args)
	{
		System.out.println(new Delta().a);
		new Delta().test();
	}
}