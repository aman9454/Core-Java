package com.jspider.upcasting;
class Delta
{
	int val=100;
}
class Example extends Delta{
	int num=122;
}
public class MainClass3 {
	public static void main(String[] args) {
		Delta ref=new Example();
		System.out.println(ref.val);
	}
}
