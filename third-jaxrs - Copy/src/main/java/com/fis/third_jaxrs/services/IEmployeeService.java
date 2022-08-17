package com.fis.third_jaxrs.services;

import java.util.Collection;

import com.fis.third_jaxrs.models.Employee;

public interface IEmployeeService {
	public Collection<Employee> getEmployees();
	
	public Employee addEmployee(Employee employee) ;
	
	public Collection<Employee> deleteEmployee(int id);
	
	public Employee updateEmployee(int id, Employee employee);

	public Employee getEmployee(int id);

	public Employee getEmployeeByName(String name);
}
