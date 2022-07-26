package com.fis.day04;

public class JDBCDemo {

	public static void main(String[] args) {
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.jdbc.Driver");  
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
