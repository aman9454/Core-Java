package com.jspider.constructorchaining;

class Delta 
{
	Delta(){
		this(7);
		System.out.println("Delta() Constructor");
	}
	Delta(int a){
		System.out.println("Delta(int) Constructor");
	}
}
class Example extends Delta{
	Example(){
		this(19);
		System.out.println("Example() Constructor");
	}
	Example(int a){
		System.out.println("Example(int) Constructor");
	}
}
public class MAinClass7 {
	public static void main(String[] args) {
		Example ex=new Example();
	}
}
