package com.jspider.filehandling;

import java.io.File;
import java.io.IOException;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ref = new File("/Users/amansingh/Documents/Hello/JAVA/Module 2/File_Handling/","Demo.txt");
		boolean bool = ref.exists();
		if(bool==false)
		{
			try
			{
				ref.createNewFile();
				System.out.println("File Created");
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("File Already Exists");
		}

	}

}
