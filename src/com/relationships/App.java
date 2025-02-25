package com.relationships;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.jpaproect");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Professor prof1 = new Professor("Abel Cumbane");
		Professor prof2 = new Professor("Beto Abel");
		
		ResearchProject project1 = new ResearchProject("Projecto de Reabilitar casas");
		ResearchProject project2 = new ResearchProject("Projecto de Estudos Fisicos");
		ResearchProject project3 = new ResearchProject("Projecto de Alimentacao");
		
		prof1.assinProjectToProfessor(project1);
		prof1.assinProjectToProfessor(project2);
		prof2.assinProjectToProfessor(project3);
		prof2.assinProjectToProfessor(project2);
		
		project1.assinProfessorToProject(prof1);
		project1.assinProfessorToProject(prof2);
		project1.assinProfessorToProject(prof1);
		project1.assinProfessorToProject(prof2);
		
		entityManager.persist(prof1);
		entityManager.persist(prof2);
		entityManager.persist(project1);
		entityManager.persist(project2);
		entityManager.persist(project3);
		
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
		
	}

}
