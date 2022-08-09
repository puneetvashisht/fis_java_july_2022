package com.fis.first_jaxrs.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Collection;

import com.fis.first_jaxrs.model.Student;

public class StudentJdbcService implements IStudentService{
	
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

	@Override
	public Collection<Student> fetchAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStudent(Student student) {
		try {
			// connection
			Connection con = getConnection();

			System.out.println("3. create statement...");
			PreparedStatement stmt = con
					.prepareStatement("insert into zumba.students values (?, ?, ?, ?);");
			stmt.setLong(1, student.getId());
			stmt.setString(2, student.getName());
			stmt.setString(3, student.getCourse());
			stmt.setString(4, student.getYear());

			System.out.println("4. execute query...");
			int records = stmt.executeUpdate();
			System.out.println(records);

			System.out.println("5. close the connection...");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
