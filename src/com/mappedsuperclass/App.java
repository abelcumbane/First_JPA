package com.mappedsuperclass;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.jpaproect");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Persona p = new Persona();
		
		p.setName("Abel");
		p.setAge(25);
		p.setDrivingLicence("AAA-234-MC");
		
		entityManager.persist(p);
		
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
		
	}
	


}
