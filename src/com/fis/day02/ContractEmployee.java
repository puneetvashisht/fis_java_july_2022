package com.fis.day02;

public class ContractEmployee extends Employee {

	

	public ContractEmployee(int id, String name, double salary) {
		super(id, name, salary);
	}
	
	@Override
	public void incrementSalary() {
		this.salary += 5000;
	}

	@Override
	public String toString() {
		return "ContractEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public void payPremium() {
		System.out.println("Contractuals Pay Premium");
		
	}

	
	
	

}
