package com.fis.third_jaxrs.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.fis.third_jaxrs.models.Employee;

public class EmployeeJdbcService implements IEmployeeService {
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			System.out.println("1. driver is loaded...");
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("2. connected to db...");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zumba", "root", "rootroot");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}
	
	public Collection<Employee> getEmployees(){
		Collection<Employee> employees = new ArrayList<>();

		try {
			// connection
			Connection con = getConnection();

			System.out.println("3. create statement...");
			Statement stmt = con.createStatement();

			System.out.println("4. execute query...");
			ResultSet rs = stmt.executeQuery("select * from employees");

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double salary = rs.getDouble(3);

				Employee employee = new Employee(id, name, salary);
				employees.add(employee);

			}

			System.out.println(employees);
			System.out.println("5. close the connection...");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employees;
//		return null;
	}
	
	public Employee addEmployee(Employee employee) {
//		employees.put(employee.getId(), employee);
		try {
			// connection
			Connection con = getConnection();

			System.out.println("3. create statement...");
			PreparedStatement stmt = con
					.prepareStatement("insert into zumba.employees values (?, ?, ?);");
			stmt.setInt(1, employee.getId());
			stmt.setString(2, employee.getName());
			stmt.setDouble(3, employee.getSalary());

			System.out.println("4. execute query...");
			int records = stmt.executeUpdate();
			System.out.println(records);

			System.out.println("5. close the connection...");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	public Collection<Employee> deleteEmployee(int id){
//		employees.remove(id);
		return null;
	}
	
	public Employee updateEmployee(int id, Employee employee){
//		employees.put(employee.getId(), employee);
		return null;
	}

	public Employee getEmployee(int id) {
//		return employees.get(id);
		return null;
	}

	@Override
	public Employee getEmployeeByName(String name) {
		Employee employee = null;
		try {
			// connection
			Connection con = getConnection();

			System.out.println("3. create statement...");
			PreparedStatement stmt = con.prepareStatement("select * from employees where name=?");

			stmt.setString(1, name);

			System.out.println("4. execute query...");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String eName = rs.getString(2);
				double salary = rs.getDouble(3);

				employee = new Employee(id, eName, salary);

			}

			System.out.println("5. close the connection...");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}
}
