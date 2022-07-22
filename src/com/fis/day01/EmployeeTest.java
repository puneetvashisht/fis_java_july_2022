package com.fis.day01;



public class EmployeeTest {

	public static void main(String[] args) {
		Address a1 = new Address(35, "Jangpura", "Delhi");
		Employee employee = new Employee(4334, "Harshit", 100000, a1);
//		employee.salary = -3434;
		employee.setSalary(33444);
		System.out.println(employee);
	
		
		Address a2 = new Address(14, "Marathalli", "Bangalore");
		System.out.println("Moved to new address...");
		employee.changeAddress(a2);

		System.out.println(employee);

	}

}
