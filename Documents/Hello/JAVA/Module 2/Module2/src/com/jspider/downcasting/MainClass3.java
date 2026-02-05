package com.jspider.downcasting;
class Delta
{
	int val=100;
}
class Example extends Delta
{
	int num=200;
}
public class MainClass3 {
	public static void main(String[] args) {
		Delta ref=new Example();
		System.out.println(ref.val);
		
		Example obj=(Example)ref;
		System.out.println(obj.val);
		System.out.println(obj.num);
	}
}
