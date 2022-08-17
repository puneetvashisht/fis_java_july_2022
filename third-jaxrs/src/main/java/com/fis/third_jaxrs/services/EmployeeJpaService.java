package com.fis.third_jaxrs.services;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fis.third_jaxrs.models.Employee;

public class EmployeeJpaService implements IEmployeeService {
	// session factory
	static EntityManagerFactory emf;
	private static EntityManager em;
	static {
		emf = Persistence.createEntityManagerFactory("third-jaxrs");
		
		// session
	    em = emf.createEntityManager();
	}

	@Override
	public Collection<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		return employee;
		
	}

	@Override
	public Collection<Employee> deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
