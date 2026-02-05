package com.jspider.polymorphism;
class Launcher{
	void open(int a) {
		System.out.println("Open in google Chrome");
	}
	void open(double d) {
		System.out.println("Open in Microsoft Edge ");
	}
	void open(String s) {
		System.out.println("Open in Mozilla Firefox");
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launcher obj=new Launcher();
		obj.open(33);
		obj.open(64.4);
		obj.open("a");

	}

}
