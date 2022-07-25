package com.fis.day03;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	private double salary;
	long phoneNumber;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary > 0) {
			this.salary = salary;
		}
		
	}



	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;

	}
	public Employee(int id, String name, double salary, long phoneNumber) {
		this(id, name, salary);
		this.phoneNumber = phoneNumber;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary +  "]";
	}

	// behavior -- methods
	public String getInfo() {
		return "Id: " + this.id + "Name: " + this.name + "salary: " + this.salary;
	}

	public void incrementSalary(int amount) {

	}

	
	

//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return id == other.id;
//	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name, salary);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return id == other.id && Objects.equals(name, other.name)
//				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
//	}

	@Override
	public int compareTo(Employee o) {	
		return this.id - o.id;
	}
	
	


}
