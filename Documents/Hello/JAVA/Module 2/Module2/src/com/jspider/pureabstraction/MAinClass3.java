package com.jspider.pureabstraction;
interface Alpha
{
	void test();
}
interface Beta
{
	void show();
}
class Gamma implements Alpha,Beta
{
	@Override
	public void show() {
		System.out.println("Executing show() ");
		
	}
	@Override
	public void test() {
		System.out.println("Executing disp() ");
		
	}
}
public class MAinClass3 {
	public static void main(String[] args) {
		Gamma obj=new Gamma();
		obj.test();
		obj.show();
	}

}
