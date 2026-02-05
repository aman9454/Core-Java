package com.jspider.examples;

public class Data implements Cloneable {

	int size;
	
	public static void main(String[] args) throws CloneNotSupportedException{
		Data ref=new Data();
		ref.size=12;
		
		Data copy = (Data)ref.clone();
		System.out.println(copy.size);
				
	}

}
