package com.fis.third_jaxrs.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.fis.third_jaxrs.models.Employee;

public class EmployeeService implements IEmployeeService {
	static Map<Integer, Employee> employees = new HashMap<>();
	static {
		employees.put(12, new Employee(12, "Priya", 33443.34));
		employees.put(2, new Employee(2, "Raj", 43443.34));
	}
	
	public Collection<Employee> getEmployees(){
		return employees.values();
	}
	
	public Employee addEmployee(Employee employee) {
		employees.put(employee.getId(), employee);
		return employee;
	}
	
	public Collection<Employee> deleteEmployee(int id){
		employees.remove(id);
		return employees.values();
	}
	
	public Employee updateEmployee(int id, Employee employee){
		employees.put(employee.getId(), employee);
		return employee;
	}

	public Employee getEmployee(int id) {
		return employees.get(id);
	}

	@Override
	public Employee getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
