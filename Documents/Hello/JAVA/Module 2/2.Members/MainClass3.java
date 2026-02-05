class Example
{
	static char ch='x';
	static boolean bool=true;
	static void disp()
	{
		System.out.println("Executing test()....");
	}
	static void send()
	{
		System.out.println("Executing help()....");
	}
}
public class MainClass3
{
	public static void main(String[] args)
	{
		System.out.println(Example.ch);
		System.out.println(Example.bool);
		Example.disp();
		Example.send();
	}
}