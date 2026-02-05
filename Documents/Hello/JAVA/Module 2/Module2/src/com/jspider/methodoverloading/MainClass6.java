package com.jspider.methodoverloading;
class Irctc{
	void search(int trainNumber) {
		System.out.println("Search with TrainNumber");
	}
	void search(String src, String dest) {
		System.out.println("Search with Location");
	}
	void search(long pnr) {
		System.out.println("Search with PNR");
	}
}
public class MainClass6 {
	public static void main(String[] args) {
		Irctc obj=new Irctc();
		obj.search(322323);
		obj.search(9273744982729837l);
		obj.search("Bang", "Gkp");
	}

}
