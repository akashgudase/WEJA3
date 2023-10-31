package com.jspiders.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspiders.hibernate.dto.Student;

public class StudentDAO5 {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {

		openConnection();
		entityTransaction.begin();

		Query query = entityManager.createQuery("SELECT student FROM Student student WHERE id = ?1");
		query.setParameter(1, 2);
		@SuppressWarnings("unchecked")
		List<Student> students = query.getResultList();
		for (Student student : students) {
			System.out.println(student);
		}

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
