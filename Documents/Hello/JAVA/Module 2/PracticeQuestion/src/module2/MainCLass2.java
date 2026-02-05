package module2;
class Example
{
	static String str="aman";
	static void disp()
	{
		System.out.println("Disp");
	}
	static void help()
	{
		System.out.println("help");
		Example.disp();
		System.out.println("Hello help");
	}
}
public class MainCLass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Example.str);
		Example.help();
		Example.disp();

	}

}
