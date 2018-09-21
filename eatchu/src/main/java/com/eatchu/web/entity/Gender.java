package com.eatchu.web.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gender {
	
	@Id
	private int id;
	private String name;
	
	public Gender() {
		// TODO Auto-generated constructor stub
	}

	public Gender(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Gender [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
