package com.jspider.partialabstraction;

public class ContentManager {
	static void control(Hotstar hs)
	{
		if(hs!=null)
		{
			hs.login();
			hs.watch();
		}
	}

}
