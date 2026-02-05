package com.jspider.widening;
class Demo
{
	void test(float arg) {
		System.out.println("VAlus : "+arg);
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		Demo ref=new Demo();
		ref.test(4.5f);
		ref.test(10);
		ref.test('a');
	}

}
