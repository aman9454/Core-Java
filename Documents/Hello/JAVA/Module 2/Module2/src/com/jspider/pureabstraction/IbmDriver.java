package com.jspider.pureabstraction;

public class IbmDriver implements Driver{
	@Override
	public void register()
	{
		System.out.println("Register to DB2");
	}

}
