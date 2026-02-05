package com.jspider.filehandling;

import java.io.File;

public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ref = new File("/Users/amansingh/Documents/Hello/JAVA/Module 2");
		String[] arr= ref.list();
		for(int i=0;i<arr.length;i++)
		{
			File obj=new File(ref,arr[i]);
			if(obj.isFile()==true)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
