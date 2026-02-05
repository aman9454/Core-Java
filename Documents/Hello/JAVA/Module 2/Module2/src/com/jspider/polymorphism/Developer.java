package com.jspider.polymorphism;

public class Developer {
	void coding() {
		System.out.println("Coding");
	}
}
class FrontendDeveloper extends Developer
{
	@Override
	void coding() {
		System.out.println("HTMl,CSS, JAva Script");
	}
}

class BackendDeveloper extends Developer
{
	@Override
	void coding() {
		System.out.println("JAva,SQL ");
	}
}
