package com.pranjal.learning.jpa.jpain10steps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Table - User

@Entity
public class Person {
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String role;
	
	
	protected Person(){}
	
	public Person(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	
	

}
