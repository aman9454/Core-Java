package com.jspider.pureabstraction;
interface Delta
{
	void disp();
	void play();
	
}
class Example implements Delta{
	@Override
	public void play()
	{
		System.out.println("Executing Play");
	}
	@Override
	public void disp()
	{
		System.out.println("Executing disp");
	}
	
}
public class MainClass2 {
	public static void main(String[] args) {
		Delta ref=new Example();
		ref.disp();
		ref.play();
	}

}
