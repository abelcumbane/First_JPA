package com.jpaproect;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
@NamedQueries({
	@NamedQuery(name = "person.getAll", query ="SELECT p FROM Person p"),
	@NamedQuery(name = "person.getPersonByName", query = "SELECT p FROM Person p WHERE p.name = :name"),
	@NamedQuery(name = "person.getPersonById", query = "SELECT p FROM Person p WHERE p.id = :id" )
})
public class Person {  
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		
		private String name;
		private int age;
		
		
		public Person() {	
			
		}
		
		public Person(String name, int age) {
			
			this.name = name;
			this.age = age;
		}
	
		public int getId() {
			return id;
		}
	
		public void setId(int id) {
			this.id = id;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return name + "-" + age;
		}

}
