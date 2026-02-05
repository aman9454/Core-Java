package com.jspider.hasarelation;
class Alpha {
	char ch='a';
	void play() {
		System.out.println("Executing play");
	}
}
class Beta {
	Alpha a;
	Beta (Alpha a)
	{
		this.a=a;
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		Alpha ref=new Alpha();
		Beta b=new Beta(ref);
		System.out.println(b.a.ch);
		b.a.play();
	}

}
