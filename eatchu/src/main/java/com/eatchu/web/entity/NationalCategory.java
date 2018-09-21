package com.eatchu.web.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NationalCategory {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private long categoryId;
	
	public NationalCategory() {
		// TODO Auto-generated constructor stub
	}

	public NationalCategory(long id, String name, long categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
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

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "NationalCategory [id=" + id + ", name=" + name + ", categoryId=" + categoryId + "]";
	}
	
	
}
