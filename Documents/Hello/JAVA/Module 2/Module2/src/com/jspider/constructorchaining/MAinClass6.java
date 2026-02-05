package com.jspider.constructorchaining;
class Alpha
{
	Alpha()
	{
		System.out.println("Alpha() Constructor");
	}
	Alpha(int a){
		this();
		System.out.println("Alpha(int) Constructor");
	}
}
class Beta extends Alpha
{
	Beta()
	{
		super(21);
		System.out.println("Beta() Constructor");
	}
}
public class MAinClass6 {
	public static void main(String[] args) {
		Beta obj=new Beta();
	}
}
