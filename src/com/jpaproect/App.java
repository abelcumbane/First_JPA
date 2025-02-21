package com.jpaproect;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.jpaproect");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		//Faz insercao na Tabela student da Base de Dados
		//Student s = new Student("Abel", 25,"Rua 4, Maputo");
		
		//Faz insercao na Tabela person da Base de Dados
		//Person p = new Person("Puto","puto@emal.com");
		
		//Faz a leitura dos dados que estao na tabela person na BD:
		//Person p = entityManager.find(Person.class, 2);
		//System.out.println(p);
		
		Person p = entityManager.find(Person.class, 2);
		entityManager.remove(p);

		
		//entityManager.persist(p);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
		
	}

}
