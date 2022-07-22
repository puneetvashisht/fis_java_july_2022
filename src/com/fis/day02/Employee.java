package com.fis.day02;

public abstract class Employee implements Insurance {
	
	int id;
	String name;
	double salary;
	static final String companyName = "FIS";
	
	
	public static String getCompanyName() {
//		System.out.println(name);
//		applyLeave()
		return companyName;
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// definations
	public void applyLeave() {
		System.out.println("Apply leave");
	}
	
	@Override
	public final void claim() {
		System.out.println("Make claim process");
		
	}
	
	//declarations
	public abstract void incrementSalary();
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
