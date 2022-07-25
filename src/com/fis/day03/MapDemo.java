package com.fis.day03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Employee employee1 = new Employee(4339, "Harshit", 100000, 9999111888l);
		Employee employee2 = new Employee(23, "Priya", 300000, 9999222888l);
		Employee employee3 = new Employee(433, "Ankit", 200000, 9999111777l);
		
		long phoneNumber = 9999111777l;
		
		Map<Long, Employee> employeeMap = new HashMap<>();
		employeeMap.put(9999111888l, employee1);
		employeeMap.put(9999222888l, employee2);
		employeeMap.put(9999111777l, employee3);
		employeeMap.put(9999111777l, null);
		employeeMap.put(null, employee2);
		
		System.out.println(employeeMap.get(phoneNumber));
		
		System.out.println(employeeMap);
		
		Set<Long> keys = employeeMap.keySet();
		for(Long key : keys) {
			System.out.println(employeeMap.get(key));
		}
		
		Set<Entry<Long, Employee>> entries = employeeMap.entrySet();
		System.out.println(entries);
		
		Collection<Employee> emps = employeeMap.values();
		System.out.println(emps);
	}

}
