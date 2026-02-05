package com.jspider.methodoverloading;
class Sample{
	void play(int a) {
		System.out.println("PUBG");
	}
	void play(int a, int b) {
		System.out.println("COD");
	}
	void play(int a, int b, int c) {
		System.out.println("FREE FIRE");
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.play(22);
		obj.play(33, 34);
		obj.play(3, 044, 03);
	}

}
