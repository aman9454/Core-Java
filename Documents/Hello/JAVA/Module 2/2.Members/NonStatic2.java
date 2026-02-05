class Beta
{
	char p='A';
	boolean q=true;
	void test()
	{
		System.out.println("Executing test()....");
	}
	void play()
	{
		System.out.println("Executing play()....");
	}
}
public class NonStatic2
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