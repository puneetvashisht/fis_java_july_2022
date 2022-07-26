package com.fis.day03;

import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.Comparator;
import java.util.List;

public class SortDemo2 {
	
	public static void main(String... args) {
		Employee employee1 = new Employee(4339, "Harshit", 100000);
		Employee employee2 = new Employee(23, "Priya", 300000);
		Employee employee3 = new Employee(433, "Ankit", 200000);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		System.out.println(employees);
		
		sort(employees);
		
		System.out.println(employees);
		
		sort(employees, new SalaryComparator());
		
		System.out.println(employees);
		
		//using anonymous class syntax
//		sort(employees, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.name.compareTo(o2.name);
//			}
//			
//		});
		
		Comparator<Employee> nameComparator = (o1, o2) -> o1.name.compareTo(o2.name);
		sort(employees,  nameComparator ); 
		
		System.out.println(employees);
		
//		System.out.println(employees.contains(new Employee(23, "Priya", 300000)));
		
	}

}
