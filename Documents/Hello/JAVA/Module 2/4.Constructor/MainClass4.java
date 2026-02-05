class Alpha
{
	int x;
	double y;
	char c;

	Alpha()
	{
		x=26;
		y=7.45;
		c='J';
	}
}
public class MainClass4
{
	public static void main(String[] args)
	{
		Alpha ref=new Alpha();
		System.out.println(ref.x);
		System.out.println(ref.y);
		System.out.println(ref.c);
		
	}
}