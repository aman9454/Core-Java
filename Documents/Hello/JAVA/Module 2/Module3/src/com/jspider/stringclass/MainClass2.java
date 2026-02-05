package com.jspider.stringclass;

public class MainClass2 {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Qspider");
		System.out.println(buffer.toString());
		System.out.println(buffer.hashCode());
		
		StringBuilder builder = new StringBuilder("Jspider");
		System.out.println(builder.toString());
	}
}
