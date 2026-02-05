package module2;

import java.util.ArrayList;
import java.util.Scanner;

public class money {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter The Money ");
			int m = sc.nextInt();
			al.add(m);
			System.out.println("Do you want to continue y/n ");
			char ch = sc.next().toLowerCase().charAt(0);
			if(ch=='n') {
				break;
			}
		}
		int sum=0;
		for(Object i:al) {
			sum=sum+(int)i;
		}
		System.out.println("Total money "+sum);
	}

}
