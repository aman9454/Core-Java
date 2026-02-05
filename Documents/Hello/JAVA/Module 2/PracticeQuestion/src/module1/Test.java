package module1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
			al.add(10);
			al.add(20);
			al.add(30);
			Iterator i = al.iterator(); 
			System.out.println(i.next());
			System.out.println(i.next());
			System.out.println(i.next());
			System.out.println(i.next());
	}
}
