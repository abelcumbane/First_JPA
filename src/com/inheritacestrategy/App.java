package com.inheritacestrategy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.jpaproect");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Bus b = new Bus("Name of Bus",100);
		Car c = new Car("Name of Car",200);
		
		entityManager.persist(b);
		entityManager.persist(c);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
	}

}
