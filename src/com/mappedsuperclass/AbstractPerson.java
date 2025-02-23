package com.mappedsuperclass;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractPerson {
	
	private String drivingLicence;
	
	public AbstractPerson() {

	}
	
	public AbstractPerson(String drivingLicence) {
		this.drivingLicence = drivingLicence;

	}

	public String getDrivingLicence() {
		return drivingLicence;
	}

	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}	

}
