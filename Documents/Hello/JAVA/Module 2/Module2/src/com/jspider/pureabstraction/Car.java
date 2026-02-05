package com.jspider.pureabstraction;

public class Car implements Vehicle{
	@Override
	public void start()
	{
		System.out.println("Starting Car");
	}
	@Override
	public void stop()
	{
		System.out.println("Stop Car");
	}

}
