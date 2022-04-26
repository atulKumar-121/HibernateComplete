package com.mapping.xml;

public class Person {
	private int id;
	private String fname;
	private String lname;
	private String email;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String fName, String lName, String email) {
		super();
		this.id = id;
		this.fname = fName;
		this.lname = lName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFName() {
		return fname;
	}
	public void setFName(String fName) {
		this.fname = fName;
	}
	public String getlName() {
		return lname;
	}
	public void setlName(String lName) {
		this.lname = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
