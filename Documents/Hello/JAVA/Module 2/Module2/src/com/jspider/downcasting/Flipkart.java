package com.jspider.downcasting;

public class Flipkart {
	static void deliveryProduct(Product p)
	{
		if(p instanceof Laptop)
		{
			System.out.println("Deliver by Scooter/Bike");
		}
		else if(p instanceof Stove)
		{
			System.out.println("Deliver by Scooter/Bike");
		}
		else if(p instanceof Bed)
		{
			System.out.println("Deliver by Scooter/Bike");
		}
	}

}
