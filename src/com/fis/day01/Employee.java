package com.fis.day01;


public class Employee {

	int id;
	String name;
	double salary;
	Address address;

	public Employee(int id, String name, double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	// behavior -- methods
	public String getInfo() {
		return "Id: " + this.id + "Name: " + this.name + "salary: " + this.salary;
	}

	public void incrementSalary(int amount) {

	}

	public void changeAddress(Address address) {
		this.address = address;
		
	}

}
