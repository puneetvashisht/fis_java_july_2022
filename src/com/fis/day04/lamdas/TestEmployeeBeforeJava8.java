package com.fis.day04.lamdas;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Condition{
	boolean test(Employee e);
}



public class TestEmployeeBeforeJava8 {
	
	static List<Employee> employees = new ArrayList<>();
	
	static void printEmployees(Condition condition){
		for(Employee e : employees) {
			if(condition.test(e)) {
				System.out.println(e);
			}	
		}
	}
	
//	static void printEmployeesWithStartingLetter(String letter){
//		for(Employee e : employees) {
//			if(e.name.startsWith(letter))
//				System.out.println(e);
//		}
//	}
	
	// print all the employees
	
	// print all the employees with name start with letter 'P'
	
	// print all employees with names ending with letter 't'
	
	// print all employees having salaries greater than 200000
	

	public static void main(String[] args) {
		Employee employee1 = new Employee(4339, "Harshit", 100000, 9999111888l);
		Employee employee2 = new Employee(23, "Priya", 300000, 9999222888l);
		Employee employee3 = new Employee(433, "Ankit", 200000, 9999111777l);
		Employee employee4 = new Employee(232, "Prikshit", 140000, 9999222888l);
		Employee employee5 = new Employee(43, "Padma", 240000, 9999111777l);
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
//		System.out.println(employees);
		System.out.println(" -- ---- -print all the employees -- -- - - - - - - -");
//		printEmployees(new Condition() {
//			@Override
//			public boolean test(Employee e) {
//				return true;
//			}	
//		});
		printEmployees((e)-> true);
		
		System.out.println(" -- ---- - -- print all the employees with name start with letter 'P'-- - - - - - - -");
		
//		printEmployees(new Condition() {
//			@Override
//			public boolean test(Employee e) {
//				return e.name.startsWith("P");
//			}	
//		});
		printEmployees((e)-> e.name.startsWith("P"));
		
		System.out.println(" -- ---- - -print all employees with names ending with letter 't'- -- - - - - - - -");
		
		printEmployees(new Condition() {
			@Override
			public boolean test(Employee e) {
				return e.name.endsWith("t");
			}	
		});
		
		
		System.out.println(" -- ---- -print all employees having salaries greater than 200000 -- -- - - - - - - -");
		
		printEmployees(new Condition() {
			@Override
			public boolean test(Employee e) {
				return e.getSalary() > 200000;
			}	
		});
		
		
//		printEmployeesWithStartingLetter("P");

	}

}
