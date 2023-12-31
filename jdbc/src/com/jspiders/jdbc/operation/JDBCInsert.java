package com.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {

	public static void main(String[] args) throws SQLException {

		// Register Driver
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);

		// Open Connection
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/weja3?user=root&&password=root");

		// Create Statement
		Statement statement = connection.createStatement();

		// Execute Statement
		statement.execute("INSERT INTO student VALUES(4,'Mahesh','mahesh@gmail.com',25,25000)");

		// Process Result
		System.out.println("Data inserted.");

		// Close Connection
		statement.close();
		connection.close();

		// DeRegister Driver
		DriverManager.deregisterDriver(driver);

	}

}
