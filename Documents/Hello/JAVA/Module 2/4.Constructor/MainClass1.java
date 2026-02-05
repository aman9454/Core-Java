class Demo
{
	int val=10;
	void test()
	{
		System.out.println("Executing test() ...");
	}
}
public class MainClass1
{
	public static void main(String[] args)
	{
		Demo ref=new Demo();
		System.out.println(ref.val);
		ref.test();
	}
}