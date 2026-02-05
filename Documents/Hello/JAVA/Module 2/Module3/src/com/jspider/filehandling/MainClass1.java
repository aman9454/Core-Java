package com.jspider.filehandling;

import java.io.File;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ref=new File("/Users/amansingh/Documents/Hello/JAVA/Module 2/File_Handling");
		boolean bool = ref.exists();
		if(bool==false)
		{
			ref.mkdir();
			System.out.println("Folder Created");
		}
		else
		{
			System.out.println("Folder already created");
		}

	}

}
