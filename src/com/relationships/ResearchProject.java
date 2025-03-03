package com.relationships;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class ResearchProject {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectId;
	
	@Column(name = "project_name")
	private String projectName;
	
	@ManyToMany
	@JoinTable( name = "prof_projects", joinColumns = @JoinColumn(name = "projectId"),
								inverseJoinColumns = @JoinColumn(name = "professorId"))
	private List<Professor> professors;
	
	public ResearchProject() {
		this.professors = new ArrayList<>();
	}


	public ResearchProject(String projectName) {
		this();
		this.projectName = projectName;
	}
	
	public void assinProfessorToProject(Professor professor) {
		this.professors.add(professor);
		
	}


	public int getProjectId() {
		return projectId;
	}


	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public List<Professor> getProfessors() {
		return professors;
	}


	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}
	
	

}
