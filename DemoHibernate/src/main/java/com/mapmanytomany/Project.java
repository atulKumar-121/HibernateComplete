package com.mapmanytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pId;
	private String projectName;
	@ManyToMany 
	private List<Employee> employees;

	public Project(int pId, String projectName, List<Employee> employees) {
		super();
		this.pId = pId;
		this.projectName = projectName;
		this.employees = employees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

}
