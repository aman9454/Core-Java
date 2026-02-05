package com.jspider.filehandling;

import java.io.File;
import java.io.IOException;

public class MAinCLass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if file exists then delete otherewise show file not found
		
		File ref=new File("/Users/amansingh/Documents/Hello/JAVA/Module 2/File_Handling","Demo.txt");
		boolean bool = ref.exists();
		if(bool==true)
		{
			ref.delete();
			System.out.println("Deleted");
		}
		else
		{
			System.out.println("File not found");
		}

	}

	

}
