package com.relationships;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.jpaproect");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Address address = new Address();
		address.setStreetName("Rua 4, Maputo");
		address.setZipCode(144);
		
		
		Employee employee = new Employee();
		employee.setEmployeeName("Abel");
		employee.setAddress(address);
		
		address.setEmployee(employee);
		
		entityManager.persist(employee);
		entityManager.persist(address);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
		
	}

}
