package com.jspider.filehandling;

import java.io.File;

public class MainClass5 {
	public static void main(String[] args) {
		
		//for checking how many files are there in the folder
		
		File ref = new File("/Users/amansingh/Documents/Hello/JAVA/Module 2");
		String[] arr= ref.list();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
