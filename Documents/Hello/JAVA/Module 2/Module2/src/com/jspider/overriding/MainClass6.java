package com.jspider.overriding;
class Windows10{
	void startMenu() {
		System.out.println("List View");
	}
}
class Windows11 extends Windows10{
	@Override
	void startMenu() {
		System.out.println("Box View");
	}
}
public class MainClass6 {
	public static void main(String[] args) {
		Windows10 obj=new Windows11();
		obj.startMenu();
	}

}
