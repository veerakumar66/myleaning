package com.example.mylearning;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

	private int id;
	@Id
	private String name;
	private String description;
	private String location;
	
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(int id, String name, String description, String location) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.location = location;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
