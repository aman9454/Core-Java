package com.jspider.examples;
class Connection{
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("Releasing Resoource");
	}
}
public class MainClass3 {
	public static void main(String[] args) {
		Connection ref =new Connection();
		System.gc();
		
		ref=null;
		System.gc();
	}

}
