package com.jspiders.manytomanyuni.dao;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.manytomanyuni.dto.Course;
import com.jspiders.manytomanyuni.dto.Student;

public class StudentDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {

		openConnection();
		entityTransaction.begin();

		Course course1 = new Course();
		course1.setName("SQL");
		course1.setFees(10000);

		Course course2 = new Course();
		course2.setName("CORE JAVA");
		course2.setFees(15000);

		Course course3 = new Course();
		course3.setName("WEB TECH");
		course3.setFees(20000);

		Course course4 = new Course();
		course4.setName("J2EE");
		course4.setFees(25000);

		Student student1 = new Student();
		student1.setName("Nayan");
		student1.setEmail("nayan@gmail.com");
		student1.setAge(22);
		student1.setCourses(Arrays.asList(course1, course3));
		entityManager.persist(student1);

		Student student2 = new Student();
		student2.setName("Amar");
		student2.setEmail("amar@gmail.com");
		student2.setAge(24);
		student2.setCourses(Arrays.asList(course2, course4));
		entityManager.persist(student2);

		entityTransaction.commit();
		closeConnection();

	}

	private static void openConnection() {

		entityManagerFactory = Persistence.createEntityManagerFactory("student");
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
