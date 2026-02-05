package com.jspider.pureabstraction;

public class MainClass8 {
	public static void main(String[] args) {
		OracleDriver od = new OracleDriver();
		DriverManager.registerDriver(od);
		
		MicrosoftDriver md = new MicrosoftDriver();
		DriverManager.registerDriver(md);
		
		IbmDriver id = new IbmDriver();
		DriverManager.registerDriver(id);
	}

}
