class Delta
{
	int a=50;
	double b=4.5;
	void test()
	{
		System.out.println("Executing test()....");
	}
	void play()
	{
		System.out.println("Executing play()....");
	}
}
public class MainClass
{
	public static void main(String[] args)
	{
		Delta ref=new Delta();

		System.out.println(ref.a);
		System.out.println(ref.b);
		ref.test();
		ref.play();
	}
}