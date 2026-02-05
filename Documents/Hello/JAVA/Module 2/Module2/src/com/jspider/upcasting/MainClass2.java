package com.jspider.upcasting;
class Alpha
{
	void test() {
		System.out.println("Executing test()......");
	}
}
class Beta extends Alpha
{
	void disp() {
		System.out.println("Executing disp()......");
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		Beta ref=new Beta();
		ref.test();
		ref.disp();
		
		Alpha obj=ref;
		obj.test();
	}

}
