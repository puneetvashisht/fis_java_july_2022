package com.fis.day02;

public class TestEmployee {

	public static void main(String[] args) {
		Employee [] employees = new Employee[4];
		
		RegularEmployee re1 = new RegularEmployee(12, "RE1", 40000);
		RegularEmployee re2 = new RegularEmployee(12, "RE2", 50000);
		
		ContractEmployee ce1 = new ContractEmployee(12, "CE1", 40000);
		ContractEmployee ce2 = new ContractEmployee(12, "CE2", 50000);
		
		employees[0] = re1;
		employees[1] = re2;
		employees[2] = ce1;
		employees[3] = ce2;
		
		for(Employee e : employees) {
			e.incrementSalary();
			System.out.println(e);
		}
		
	}
}
