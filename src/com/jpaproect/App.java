package com.jpaproect;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.jpaproect");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Student s = new Student("A", 25);
		
		entityManager.persist(s);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
		
	}

}
