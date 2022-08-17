package com.fis.third_jaxrs.resources;

import java.util.Collection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.fis.third_jaxrs.models.Employee;
import com.fis.third_jaxrs.services.EmployeeJdbcService;
import com.fis.third_jaxrs.services.IEmployeeService;

@Path("/employees")
public class EmployeeResource {
	
	IEmployeeService employeeService = new EmployeeJdbcService();
	
	@GET
//	@Produces("text/plain")
	public Collection<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
	
	//fetch 
	@Path("{id}")
	@GET
//	@Produces("text/plain")
	public Employee getEmployee(@PathParam("id") int id) {
		System.out.println(id);
		return employeeService.getEmployee(id);
	}
	
	// delete
	@Path("{id}")
	@DELETE
//	@Produces("text/plain")
	public Collection<Employee> deleteEmployee(@PathParam("id") int id) {
		return employeeService.deleteEmployee(id);
	}
	
	// creating 
	@POST
	public Employee addEmployee(Employee employee) {
		System.out.println(employee);
		return employeeService.addEmployee(employee);
	}
	
	// update
	@Path("{id}")
	@PUT
	public Employee updateEmployee(@PathParam("id") int id, Employee employee) {
		System.out.println(employee);
		return employeeService.updateEmployee(id, employee);
	}

}
