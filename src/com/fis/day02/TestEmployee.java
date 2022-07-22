package com.fis.day02;

public class TestEmployee {

	public static void main(String[] args) {
		Employee [] employees = new Employee[4];
		
		System.out.println(Employee.getCompanyName());
		
//		Employee.companyName = "XYZ";
		
		
		RegularEmployee re1 = new RegularEmployee(12, "RE1", 40000);
		
		System.out.println(re1.getCompanyName());
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
			e.claim();
			e.payPremium();
		}
		
	}
}
