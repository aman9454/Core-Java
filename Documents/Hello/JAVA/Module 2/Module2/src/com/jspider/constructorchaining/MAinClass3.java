package com.jspider.constructorchaining;
class Amazon{
	Amazon(){
		System.out.println("Initialise Shopping");
	}
	Amazon(double subscription){
		this();
		System.out.println("Initialise PrimeVideo");
		System.out.println("Initialise Amazon MUsic");
	}
}
public class MAinClass3 {
	public static void main(String[] args) {
		Amazon regular=new Amazon();
		System.out.println("-----------------");
		Amazon prime=new Amazon(2333.32);
	}
}
