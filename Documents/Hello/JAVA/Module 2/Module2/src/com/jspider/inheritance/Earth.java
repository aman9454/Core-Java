package com.jspider.inheritance;

import com.jspider.encaptulation.Water;

public class Earth extends Water
{
	
	public static void main(String[] args) {
//		System.out.println(Water.a);    Here we cannot acccess the private and Default access modifer
//		System.out.println(Water.b);
		System.out.println(Water.c);
		System.out.println(Water.d);
	}

}
