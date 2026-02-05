class Beta
{
	static char p='A';
	boolean q=true;
	static void test()
	{
		System.out.println("Executing test()....");
	}
	void play()
	{
		System.out.println("Executing play()....");
	}
}
public class StaticNonStatic
{
	public static void main(String[] args)
	{
		Beta ref=new Beta();

		System.out.println(ref.p);
		System.out.println(ref.q);
		ref.test();
		ref.play();
	}
}