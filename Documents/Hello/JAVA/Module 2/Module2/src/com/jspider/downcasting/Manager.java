package com.jspider.downcasting;

public class Manager {
	static void review(SoftwareEngineer sw)
	{
		sw.meeting();
		
		if(sw instanceof Developer)
		{
			Developer d=(Developer)sw;
			d.coding();
		}
		else if(sw instanceof Tester)
		{
			Tester t=(Tester)sw;
			t.testing();
		}
	}

}
