package com.jspider.overriding;
class Parent{
	void watchTv() {
		System.out.println("News/Serial");
	}
}
class Child extends Parent{
	@Override
	void watchTv() {
		System.out.println("Sport/Music");
	}
}
public class MainClass1 {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.watchTv();
		Child c=new Child();
		c.watchTv();
	}

}
