class Sample
{
	int num=10;
	Sample()
	{
		System.out.println("Constructor of Sample  ");
		num=10;
	}
}
public class MainClass3
{
	public static void main(String[] args)
	{
		Sample ref=new Sample();
		System.out.println(ref.num);
	}
}