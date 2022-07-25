package com.fis.day03;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		
		Employee employee1 = new Employee(4339, "Harshit", 100000, 9999111888l);
		Employee employee2 = new Employee(23, "Priya", 300000, 9999222888l);
		Employee employee3 = new Employee(433, "Ankit", 200000, 9999111777l);
		
		long phoneNumber = 9999111777l;
		
//		List<Employee> employees = new ArrayList<>();
		// un orderd
//		Set<Employee> employees = new HashSet<>();
		// insertion order
//		Set<Employee> employees = new LinkedHashSet<>();
		
//		sorted by natural order
		Set<Employee> employees = new TreeSet<>();
		
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(new Employee(23, "Kunal", 343433));
		
		System.out.println(employees);
		
//		numbers.add(1);
//		numbers.add(10);
//		System.out.println(numbers);
		
	}

}
