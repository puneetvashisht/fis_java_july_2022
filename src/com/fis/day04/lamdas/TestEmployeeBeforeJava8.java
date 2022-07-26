package com.fis.day04.lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class TestEmployeeBeforeJava8 {
	
	static List<Employee> employees = new ArrayList<>();

	public static void main(String[] args) {
		Employee employee1 = new Employee(4339, "Harshit", 100000, 9999111888l);
		Employee employee2 = new Employee(23, "Priya", 300000, 9999222888l);
		Employee employee3 = new Employee(433, "Ankit", 300000, 9999111777l);
		Employee employee4 = new Employee(232, "Prikshit", 140000, 9999222888l);
		Employee employee5 = new Employee(43, "Padma", 240000, 9999111777l);
		Employee employee6 = new Employee(43, "Padma", 240000, 9999111777l);
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		
		employees.stream()
		// intermediate
		.filter((e)-> e.getSalary() > 200000 )
		.distinct()
		.skip(1)
		.limit(1)
		// terminal
		.forEach((e)-> System.out.println(e));
		
		OptionalDouble maxSalary = employees.stream()
		.mapToDouble(e -> e.getSalary())
		.max();
		
		if(maxSalary.isPresent()) {
			System.out.println(maxSalary.getAsDouble());
		}
		
		
		employees.stream()
		.sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
		.forEach((d)-> System.out.println(d));
		
		
		boolean allMatch = employees.stream()
		.filter(e -> e.name.startsWith("P"))
		.anyMatch((e)-> e.getSalary() > 240000);
		
		System.out.println(allMatch);
		
		
		employees.parallelStream()
		.filter(e -> e.name.startsWith("P"))
		.forEach((d)-> System.out.println(d));
		
		
		Set<Employee> filteredEmployees = employees.stream()
	    .filter(e -> e.name.startsWith("P"))
	    .collect(Collectors.toCollection(TreeSet::new));
		
		System.out.println(filteredEmployees);
		
		
//		.forEach((d)-> System.out.println(d));
//		.map()
//		.min();
		
//		System.out.println(total);
		
//		.forEach((d)-> System.out.println(d));
		
	

	}

}
