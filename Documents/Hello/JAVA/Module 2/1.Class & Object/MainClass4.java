class Bike
{
	int cc;
	double milage;
	void drive()
	{
		System.out.println("Bike CC  "+cc);
	}
	void travel()
	{
		System.out.println("Bike Milage : "+milage);
	}
}
public class MainClass4{

public static void main(String[] args)
{
	Bike e1=new Bike();
	e1.cc=150;
	e1.milage=45.0;

	e1.drive();
	e1.travel();
	System.out.println("-------------------");

	Bike e2=new Bike();
	e2.cc=350;
	e2.milage=25;
	e2.drive();
	e2.travel();
}
 }