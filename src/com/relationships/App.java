package com.relationships;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.jpaproect");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		University university = new University();
		university.setUniversityName("UEM");
		
		Studentt student1 = new Studentt();
		student1.setStudentName("Alfredo");
		student1.setUniversity(university);
		
		
		Studentt student2 = new Studentt();
		student2.setStudentName("Abel");
		student2.setUniversity(university);
		
		entityManager.persist(university);
		entityManager.persist(student1);
		entityManager.persist(student2);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
		
	}

}
