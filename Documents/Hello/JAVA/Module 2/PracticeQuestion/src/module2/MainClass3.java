package module2;
class Example1
{
	int a=10;
	void help()
	{
		System.out.println("Help");
		
	}
	void disp()
	{
		System.out.println("Disp");
		
	}
}
public class MainClass3 {
	public static void main(String[] args) {
		Example1 abc=new Example1();
		System.out.println(abc.a);
		abc.help();
		abc.disp();
	}

}
