package com.relationships;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class University {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int universityId;
	
	@Column(name = "universty_name")
	private String universityName;
	
	@OneToMany(mappedBy = "university")
	private List<Studentt> students;
	
	public University() {
		this.students = new ArrayList<>();
	}
	
		public University(String universityName) {
			this();
			this.universityName = universityName;
				
			}
		
	public void addStudent(Studentt s) {
		this.students.add(s);
		
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public List<Studentt> getStudents() {
		return students;
	}

	public void setStudents(List<Studentt> students) {
		this.students = students;
	}	
	
	

}
