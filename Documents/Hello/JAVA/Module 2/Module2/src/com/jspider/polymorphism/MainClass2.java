package com.jspider.polymorphism;
class IRCTC{
	void search() {
		System.out.println("Train Details");
	}
	void search(String src, String dest) {
		System.out.println("Route Details");
	}
	void search(long pnr) {
		System.out.println("Ticket Details");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IRCTC obj=new IRCTC();
		obj.search();
		obj.search(23267764l);
		obj.search("chn", "bang");

	}

}
