package com.fis.day04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo2 {

	public static void main(String[] args) {

		try {
			System.out.println("1. driver is loaded...");
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("2. connected to db...");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zumba", "root", "rootroot");
			
			System.out.println("3. create statement...");
			Statement stmt = con.createStatement();
			
			
			System.out.println("4. execute query...");
			ResultSet rs = stmt.executeQuery("select * from users");
			
			List<User> users = new ArrayList<>();
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String email =  rs.getString(2);
				String password =  rs.getString(4);
				
				User user = new User(id, email, password);
				users.add(user);
				
			}
			
			System.out.println(users);
			System.out.println("5. close the connection...");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	

	}

}
