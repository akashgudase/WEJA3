package com.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentJDBC {

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String query;

	public void addStudent(Student student) {

		try {
			connection = openConnection();
			query = "INSERT INTO student VALUES(?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			preparedStatement.setInt(4, student.getAge());
			preparedStatement.setDouble(5, student.getFees());
			int row = preparedStatement.executeUpdate();
			System.out.println(row + " row(s) affected.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public List<Student> getAllStudents() {

		ArrayList<Student> list = new ArrayList<>();

		try {
			connection = openConnection();
			query = "SELECT * FROM student";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Student student = new Student();
				student.setId(resultSet.getInt(1));
				student.setName(resultSet.getString(2));
				student.setEmail(resultSet.getString(3));
				student.setAge(resultSet.getInt(4));
				student.setFees(resultSet.getDouble(5));
				list.add(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;

	}

	public Student getStudentById(int id) {

		Student student = new Student();

		try {
			connection = openConnection();
			query = "SELECT * FROM student WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				student.setId(resultSet.getInt(1));
				student.setName(resultSet.getString(2));
				student.setEmail(resultSet.getString(3));
				student.setAge(resultSet.getInt(4));
				student.setFees(resultSet.getDouble(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return student;

	}

	public void deleteStudent(int id) {

		try {
			connection = openConnection();
			query = "DELETE FROM student WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			int row = preparedStatement.executeUpdate();
			System.out.println(row + " row(s) affected.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void updateStudent(int id, Scanner scanner) {

		try {
			connection = openConnection();
			query = "UPDATE student SET name = ?, email = ?, age = ?, fees = ? WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			scanner.nextLine();
			System.out.println("Enter student name.");
			preparedStatement.setString(1, scanner.nextLine());
			System.out.println("Enter student email.");
			preparedStatement.setString(2, scanner.nextLine());
			System.out.println("Enter student age.");
			preparedStatement.setInt(3, scanner.nextInt());
			System.out.println("Enter student fees.");
			preparedStatement.setDouble(4, scanner.nextDouble());
			preparedStatement.setInt(5, id);
			int row = preparedStatement.executeUpdate();
			System.out.println(row + " row(s) affected.");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private Connection openConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3", "root", "root");

	}

	private void closeConnection() throws SQLException {

		if (resultSet != null) {
			resultSet.close();
		}
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (connection != null) {
			connection.close();
		}

	}

}
