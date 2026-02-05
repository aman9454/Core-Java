package com.jspider.pureabstraction;

public class MainClass7 {
	public static void main(String[] args) {
		Circle c=new Circle();
		ShapeToolKit.drawShape(c);
		
		Square s=new Square();
		ShapeToolKit.drawShape(s);
		
		Triangle t=new Triangle();
		ShapeToolKit.drawShape(t);
	}

}
