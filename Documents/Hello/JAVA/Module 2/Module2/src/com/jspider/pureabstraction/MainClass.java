package com.jspider.pureabstraction;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		VehicleSimulator.simulate(c);
		
		Bike b=new Bike();
		VehicleSimulator.simulate(b);

	}

}
