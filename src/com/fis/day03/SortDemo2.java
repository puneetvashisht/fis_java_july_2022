package com.fis.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo2 {
	
	public static void main(String[] args) {
		Employee employee1 = new Employee(4339, "Harshit", 100000);
		Employee employee2 = new Employee(23, "Priya", 300000);
		Employee employee3 = new Employee(433, "Ankit", 200000);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		System.out.println(employees);
		
		Collections.sort(employees);
		
		System.out.println(employees);
		
		Collections.sort(employees, new SalaryComparator());
		
		System.out.println(employees);
		
//		System.out.println(employees.contains(new Employee(23, "Priya", 300000)));
		
	}

}
