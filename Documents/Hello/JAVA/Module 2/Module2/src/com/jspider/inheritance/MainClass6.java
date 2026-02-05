package com.jspider.inheritance;
class Watch
{
	void showDateTime() {
		System.out.println("Showing date and time");
	}
}
class SmartWatch extends Watch{
	void showNotification() {
		System.out.println("Showing Notification");
	}
}
public class MainClass6 {
	public static void main(String[] args)
	{
		SmartWatch obj=new SmartWatch();
		obj.showDateTime();
		obj.showNotification();
	}
}
