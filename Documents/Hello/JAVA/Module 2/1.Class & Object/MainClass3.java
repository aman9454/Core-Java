class Mobile
{
	String model;
	double price;

	void call()
	{
		System.out.println("Moblie Model  "+model);
	}
	void message()
	{
		System.out.println("Moblie price : "+price+" lakh");
	}
}
public class MainClass3{

public static void main(String[] args)
{
	Mobile e1=new Mobile();
	e1.model="Apple";
	e1.price=1.5;

	e1.call();
	e1.message();
	System.out.println("-------------------");

	Mobile e2=new Mobile();
	e2.model="S25 Ultra";
	e2.price=1.3;
	e2.call();
	e2.message();
}
 }