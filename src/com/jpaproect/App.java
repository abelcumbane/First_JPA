package com.jpaproect;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

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
		
		//Faz a remocao dos dados que estao na tabela person na BD:
		//Person p = entityManager.find(Person.class, 2);
		//entityManager.remove(p);

		/*
		Person p = new Person("Abel",25);
		Person p1 = new Person("Einsten",9);
		Person p2 = new Person("Zyarie",4);
		Person p3 = new Person("Keiton",9);
		Person p4 = new Person("Jade",1);
		
		
		entityManager.persist(p);
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityManager.persist(p4);

		entityManager.getTransaction().commit();
		*/
		
		//JPQL statement
		//Plataform independent
		
		/*
		  Query query = entityManager.createNativeQuery("SELECT * FROM person",Person.class);
		  List<Person> people = (List<Person>) query.getResultList();
		*/
		
		//NamedQuery
			//TypedQuery<Person> query = entityManager.createNamedQuery("person.getAll", Person.class);
			
			TypedQuery<Person> query = entityManager.createNamedQuery("person.getPersonById", Person.class);
			query.setParameter("id", 4);
		
		List<Person> people = query.getResultList();
		
		for(Person p : people) {
			System.out.println(p);
		}
		
		entityManager.close();
		factory.close();
		
	}

}
