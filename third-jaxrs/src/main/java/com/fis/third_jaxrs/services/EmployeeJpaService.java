package com.fis.third_jaxrs.services;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.fis.third_jaxrs.models.Employee;

public class EmployeeJpaService implements IEmployeeService {
	// session factory
	static EntityManagerFactory emf;
	private static EntityManager em;
	static {
		emf = Persistence.createEntityManagerFactory("third-jaxrs");
		
		// session
	   
	}

	@Override
	public Collection<Employee> getEmployees() {
		em = emf.createEntityManager();
		
		TypedQuery<Employee> query =  em.createNamedQuery("findAll", Employee.class);
		List<Employee> employees = query.getResultList();
		
		em.close();
		return employees;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		return employee;
		
	}

	@Override
	public Collection<Employee> deleteEmployee(int id) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		// get
		Employee foundEmployee = em.find(Employee.class, id);
		
		// delete
		em.remove(foundEmployee);
		
		em.getTransaction().commit();
		em.close();
		
		return this.getEmployees();
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Employee foundEmployee = em.find(Employee.class, id);
		foundEmployee.setSalary(employee.getSalary());
		foundEmployee.setName(employee.getName());
		
		em.getTransaction().commit();
		em.close();
		
		
		
		return foundEmployee;
	}

	@Override
	public Employee getEmployee(int id) {
		em = emf.createEntityManager();

		Employee foundEmployee = em.find(Employee.class, id);
		em.close();
		return foundEmployee;
	}

	@Override
	public Employee getEmployeeByName(String name) {
		em = emf.createEntityManager();

//		Employee foundEmployee = em.find(Employee.class, id);
		
		
		TypedQuery<Employee> query =  em.createNamedQuery("findByName", Employee.class);
		query.setParameter("name", name);
		Employee employee = query.getSingleResult();
		
		em.close();
		return employee;
	}

}
