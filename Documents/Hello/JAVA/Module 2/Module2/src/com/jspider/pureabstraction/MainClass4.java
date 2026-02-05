package com.jspider.pureabstraction;
class Helper
{
	void send() {
		System.out.println("Executing send");
	}
}
interface Readable
{
	void read();
}
class Person extends Helper implements Readable
{
	@Override
	public void read() {
		System.out.println("Executing read");
	}
}
public class MainClass4 {
	public static void main(String[] args) {
		Person obj=new Person();
		obj.read();
		obj.send();
	}

}
