package com.jspider.hasarelation;
class Engine {
	void power() {
		System.out.println("Engine provide power");
	}
}
class Driver {
	void drive() {
		System.out.println("Driver is Driving");
	}
}
class Car {
	Engine eng=new Engine();
	Driver dr;
	Car(Driver dr)
	{
		this.dr=dr;
	}
}
public class MainClass3 {
	public static void main(String[] args) {
		Driver dr=new Driver();
		Car c = new Car(dr);
		c.eng.power();
		c.dr.drive();
	}

}
