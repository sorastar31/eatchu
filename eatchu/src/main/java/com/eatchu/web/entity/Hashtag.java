package com.eatchu.web.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hashtag {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	
	public Hashtag() {
		// TODO Auto-generated constructor stub
	}

	public Hashtag(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
		return "Hashtag [id=" + id + ", name=" + name + "]";
	}
	
	
}
