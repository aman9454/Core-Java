package com.jspider.stringclass;

public class MainClass3 {
	public static void main(String[] args) {
		String str = "Pani";
		System.out.println(str);
		str=str+ "Puri";
		System.out.println(str);
		
		StringBuffer buffer = new StringBuffer("Bhel");
		System.out.println(buffer);
		buffer.append("Puri");
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("Sev");
		System.out.println(builder);
		builder.append("Puri");
		System.out.println(builder);
				
	}

}
