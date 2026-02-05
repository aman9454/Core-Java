package com.jspider.overriding;

class Mother{
	void marriage() {
		System.out.println("Arranged Marriage");
	}
}
class Daughter extends Mother{
	@Override
	void marriage() {
		System.out.println("Love Marriage");
	}
}

public class MainClass3 {
	public static void main(String[] args) {
		Mother obj = new Daughter();
		obj.marriage();
	}

}

