package com.jspider.hasarelation;
class Camera {
	void selfie() {
		System.out.println("Taking Selfie");
	}
}
class SimCard {
	void service() {
		System.out.println("SMS/ Call/ Data");
	}
}
class Mobile {
	Camera cam=new Camera();
	SimCard sim;
	Mobile(SimCard sim)
	{
		this.sim=sim;
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mob= new Mobile(new SimCard());
		mob.cam.selfie();
		mob.sim.service();

	}

}
