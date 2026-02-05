package com.jspider.inheritance;
class AdobeFree
{
	void read() {
		System.out.println("Read in Adobe");
	}
}
class AdobePaid extends AdobeFree
{
	void edit(){
		System.out.println("Edit in Adobe");
	}
}
public class MainClass5 {
	public static void main(String[] args)
	{
		AdobePaid obj=new AdobePaid();
		obj.edit();
		obj.read();
		
		System.out.println("----------------");
		
		AdobeFree ref=new AdobeFree();
		ref.read();
	}
}
