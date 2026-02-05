package com.jspider.filehandling;

import java.io.File;

public class MainClass4 {
	static void displayFileDetails(File obj)
	{
		System.out.println("Length "+obj.length());
		System.out.println("Location "+obj.getAbsolutePath());
	}
	public static void main(String[] args) {
		File f1 = new File("/Users/amansingh/Documents/Hello/JAVA/Module 2/File_Handling","Demo.txt");
		
		displayFileDetails(f1);
	}
}
