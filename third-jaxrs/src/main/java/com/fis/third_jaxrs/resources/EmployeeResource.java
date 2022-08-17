package com.fis.third_jaxrs.resources;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.fis.third_jaxrs.models.Employee;
import com.fis.third_jaxrs.services.EmployeeJpaService;
import com.fis.third_jaxrs.services.IEmployeeService;

@Path("/employees")
public class EmployeeResource {
	
	static IEmployeeService employeeService = new EmployeeJpaService();
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
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
	
	
	@Path("/by")
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Employee getEmployeeByName(@QueryParam("name") String name) {
		System.out.println(name);
		return employeeService.getEmployeeByName(name);
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
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
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
