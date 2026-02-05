package com.jspider.exceptionhandling;

public class Game {
int hiScore=0;
	
	public static void main(String[] args){
		
		System.out.println("Program Start");
		Game ref = new Game();
		ref.hiScore=5000;
		
		try {
			Game copy = (Game)ref.clone();
			System.out.println(copy.hiScore);
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Clone failed");
		}
		
		System.out.println("Program Ends");
				
	}

}
