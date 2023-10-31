package com.jspiders.employeemanagementsystem.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspiders.employeemanagementsystem.dto.Employee;

public class EmployeeDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	private static void openConnection() {

		entityManagerFactory = Persistence.createEntityManagerFactory("employee");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();

	}

	private static void closeConnection() {

		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction != null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}

	}

	public void addEmployee(Employee employee) {

		openConnection();
		entityTransaction.begin();

		entityManager.persist(employee);

		entityTransaction.commit();
		closeConnection();

	}

	public void deleteEmployee(int id) {

		openConnection();
		entityTransaction.begin();

		Employee employee = entityManager.find(Employee.class, id);
		entityManager.remove(employee);

		entityTransaction.commit();
		closeConnection();

	}

	public void updateEmployee(int id, Scanner scanner) {

		openConnection();
		entityTransaction.begin();

		Employee employee = entityManager.find(Employee.class, id);
		scanner.nextLine();
		System.out.println("Enter new employee name.");
		employee.setName(scanner.nextLine());
		System.out.println("Enter new employee email.");
		employee.setEmail(scanner.nextLine());
		System.out.println("Enter new employee salary.");
		employee.setSalary(scanner.nextDouble());
		entityManager.persist(employee);

		entityTransaction.commit();
		closeConnection();

	}

	public Employee getEmployeeById(int id) {

		openConnection();
		entityTransaction.begin();

		Employee employee = entityManager.find(Employee.class, id);

		entityTransaction.commit();
		closeConnection();

		return employee;

	}

	public void getAllEmployees() {

		openConnection();
		entityTransaction.begin();

		Query query = entityManager.createQuery("SELECT employee FROM Employee employee");
		@SuppressWarnings("unchecked")
		List<Employee> employees = query.getResultList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		entityTransaction.commit();
		closeConnection();

	}

}
