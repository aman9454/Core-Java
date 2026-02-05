package com.jspider.inheritance;
class InstagramOld
{
	void post(){
		System.out.println("Posting in Instagram ");
	}
}
class InstagramNew extends InstagramOld{
	void messenger() {
		System.out.println("Messaging in Instagram ");
	}
}
public class MainClass3 {
	public static void main(String[] args) {
		InstagramOld ref=new InstagramOld();
		ref.post();
		System.out.println("-------------------------------");
		InstagramNew obj=new InstagramNew();
		obj.post();
		obj.messenger();
	}

}
