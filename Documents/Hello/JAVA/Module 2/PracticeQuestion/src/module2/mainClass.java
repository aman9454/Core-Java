package module2;

import java.util.ArrayList;
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		
	
	ArrayList al = new ArrayList();
	Scanner sc = new Scanner(System.in);
	while(true)
	{
		System.out.println("Enter Money");
		int a = sc.nextInt();
		al.add(a);
		System.out.println("Do you want to continue y/n : ");
		char ch = sc.next().toLowerCase().charAt(0);
		if(ch == 'n') {
			break;
		}
	}
	int sum=0;
	for(Object i : al)
	{
		sum=sum+(int)i;
	}
	System.out.println("Total Money "+sum);
	}
}

