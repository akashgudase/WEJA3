package com.jspiders.onetomanybi.dao;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.onetomanybi.dto.Company;
import com.jspiders.onetomanybi.dto.Employee;

public class CompanyDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {

		openConnection();
		entityTransaction.begin();

		Employee employee1 = new Employee();
		employee1.setName("Raju");
		employee1.setEmail("raju@gmail.com");
		employee1.setSalary(50000);

		Employee employee2 = new Employee();
		employee2.setName("Shyam");
		employee2.setEmail("shyam@gmail.com");
		employee2.setSalary(45000);

		Employee employee3 = new Employee();
		employee3.setName("Baburao");
		employee3.setEmail("baburao@gmail.com");
		employee3.setSalary(60000);

		Employee employee4 = new Employee();
		employee4.setName("Anjali");
		employee4.setEmail("anjali@gmail.com");
		employee4.setSalary(70000);

		Company company = new Company();
		company.setName("Mahindra");
		company.setAddress("Mumbai");

		employee1.setCompany(company);

		employee2.setCompany(company);

		employee3.setCompany(company);

		employee4.setCompany(company);

company.setEmployees(Arrays.asList(employee1, employee2, employee3, employee4));
		entityManager.persist(company);

		entityTransaction.commit();
		closeConnection();

	}

	private static void openConnection() {

		entityManagerFactory = Persistence.createEntityManagerFactory("company");
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

}
