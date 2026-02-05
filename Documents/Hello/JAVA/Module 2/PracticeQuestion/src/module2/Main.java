package module2;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<Integer, Employee> emp = new HashMap<>();
		emp.put(1, new Employee()
				.setEid(101)
				.setEname("AMan")
				.setEsal(67382));
		emp.put(2, new Employee()
				.setEid(102)
				.setEname("Aryan")
				.setEsal(67382));
		emp.put(3, new Employee()
				.setEid(103)
				.setEname("DudhBhaat")
				.setEsal(67382));
		for (int key : emp.keySet()) {
			System.out.println(key + " -> " +  emp.get(key));
		}
		
		
		
		
	}

}
