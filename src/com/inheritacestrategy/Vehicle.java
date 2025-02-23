package com.inheritacestrategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	private String name;
	
	public Vehicle() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vehicle(String name) {
			this.name = name;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
