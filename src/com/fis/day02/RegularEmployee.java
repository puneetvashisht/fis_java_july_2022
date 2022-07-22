package com.fis.day02;

public class RegularEmployee extends Employee implements Perks {

	

	public RegularEmployee(int id, String name, double salary) {
		super(id, name, salary);
	}
	
//	public void incrementSalary() {
//		this.salary *= 1.15;
//	}

	@Override
	public String toString() {
		return "RegularEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public void incrementSalary() {
		this.salary *= 1.15;
	}

	@Override
	public void goTrips() {
		System.out.println("trips. .. fun");
		
	}

	@Override
	public void attendTownhalls() {
		System.out.println("socialize. .. fun");
		
	}

	@Override
	public void payPremium() {
		System.out.println("Regulars Pay Premium");
		
	}
	

	

	

}
