package com.jspider.overriding;
class Father{
	void moterCycle() {
		System.out.println("Normal");
	}
}
class Son extends Father{
	@Override
	void moterCycle() {
		System.out.println("Abnormal");
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		Father obj = new Son();
		obj.moterCycle();
	}

}
