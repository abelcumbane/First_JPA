package com.relationships;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Professor {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int professorId;
	
	@Column(name = "professor_name")
	private String professorName;
	
	@ManyToMany(mappedBy = "professors")
	private List<ResearchProject> projects;
	
	public Professor() {
		this.projects = new ArrayList<>();
	}
	
	public Professor(String professorName ) {
		this();
		this.professorName = professorName;
		
	}
	
	public void assinProjectToProfessor(ResearchProject project) {
		this.projects.add(project);
		
		
	}

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public List<ResearchProject> getProjects() {
		return projects;
	}

	public void setProjects(List<ResearchProject> projects) {
		this.projects = projects;
	}
	
	

}
