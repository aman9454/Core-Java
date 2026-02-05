class Container
{
	int capacity;
	Container(int arg)
	{
		capacity=arg;
	}
}
public class MainClass5
{
	public static void main(String[] args)
	{
		Container c1=new Container(2000);
		System.out.println(c1.capacity);
		
		Container c2=new Container(4500);
		System.out.println(c2.capacity);

		Container c3=new Container(2060);
		System.out.println(c3.capacity);
		
	}
}