package com.inheritacestrategy;

import jakarta.persistence.Entity;

@Entity
public class Bus extends Vehicle{
	
	private int numOfPassangers;
	
	public Bus() {
		
	}

	public Bus(String name, int numOfPassangers ) {
		
		super(name);
		this.numOfPassangers = numOfPassangers;
			
		}

	public int getNumOfPassangers() {
		return numOfPassangers;
	}

	public void setNumOfPassangers(int numOfPassangers) {
		this.numOfPassangers = numOfPassangers;
	}

}
