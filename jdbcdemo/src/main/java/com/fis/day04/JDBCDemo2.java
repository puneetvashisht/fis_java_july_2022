package com.fis.day04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo2 {

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

	public static void insertUser(User user) {
		try {
			// connection
			Connection con = getConnection();

			System.out.println("3. create statement...");
			PreparedStatement stmt = con
					.prepareStatement("insert into zumba.users values (?, ?, null, ?, 0, null, null, null);");
			stmt.setInt(1, user.id);
			stmt.setString(2, user.email);
			stmt.setString(3, user.password);

			System.out.println("4. execute query...");
			int records = stmt.executeUpdate();
			System.out.println(records);

			System.out.println("5. close the connection...");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static User fetchUserByEmail(String email) {
		User user = null;
		try {
			// connection
			Connection con = getConnection();

			System.out.println("3. create statement...");
			PreparedStatement stmt = con.prepareStatement("select * from users where email=?");

			stmt.setString(1, email);

			System.out.println("4. execute query...");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String email1 = rs.getString(2);
				String password = rs.getString(4);

				user = new User(id, email1, password);

			}

			System.out.println("5. close the connection...");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public static List<User> fetchAllUsers() {

		List<User> users = new ArrayList<>();

		try {
			// connection
			Connection con = getConnection();

			System.out.println("3. create statement...");
			Statement stmt = con.createStatement();

			System.out.println("4. execute query...");
			ResultSet rs = stmt.executeQuery("select * from users");

			while (rs.next()) {
				int id = rs.getInt(1);
				String email = rs.getString(2);
				String password = rs.getString(4);

				User user = new User(id, email, password);
				users.add(user);

			}

			System.out.println(users);
			System.out.println("5. close the connection...");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;

	}

	public static void main(String[] args) {

//		System.out.println(fetchAllUsers());
//
//		User userInsert = new User(445, "test445@test.com", "testtest");
//		insertUser(userInsert);
		
//		System.out.println(fetchUserByEmail("test445@test.com"));
		
		// update user;
		
		// delete user;

	}

}
