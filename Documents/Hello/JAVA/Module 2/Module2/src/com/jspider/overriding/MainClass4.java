package com.jspider.overriding;

class FacebookOld{
	void reactions() {
		System.out.println("Like");
	}
}
class FacebookNew extends FacebookOld{
	@Override
	void reactions() {
		System.out.println("Like, Wow, Love , Sad, Angry, Haha");
	}
}

public class MainClass4 {
	public static void main(String[] args) {
		FacebookOld obj = new FacebookNew(); //Upcasting
		obj.reactions();
		
		FacebookNew fbnew = new FacebookNew();
		fbnew.reactions();
		
		FacebookOld fbold = new FacebookOld();
		fbold.reactions();
	}

}

