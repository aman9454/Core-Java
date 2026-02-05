package com.jspider.pureabstraction;

public class VehicleSimulator {
	static void simulate(Vehicle v)
	{
		if(v!=null)
		{
			v.start();
			v.stop();
		}
	}

}
