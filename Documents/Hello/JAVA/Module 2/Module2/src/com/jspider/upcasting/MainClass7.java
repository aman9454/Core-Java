package com.jspider.upcasting;

public class MainClass7 {
	public static void main(String[] args) {
		Red r=new Red();
		ColorPalette.addColor(r);
		
		Blue m=new Blue();
		ColorPalette.addColor(m);
		
		Green b=new Green();
		ColorPalette.addColor(b);
	}

}
