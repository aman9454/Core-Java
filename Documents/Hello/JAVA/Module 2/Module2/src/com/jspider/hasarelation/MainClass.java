package com.jspider.hasarelation;

class Demo{
	char ch='j';
	void help()
	{
		System.out.println("Executing Help()...");
	}
}
class Sample{
	Demo d=new Demo();
}
public class MainClass {

	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.d.ch);
		s.d.help();

	}

}
