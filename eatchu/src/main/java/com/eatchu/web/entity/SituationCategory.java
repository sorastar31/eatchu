package com.eatchu.web.entity;

public class SituationCategory {

	private long id;
	private String name;
	private long categoryId;
	
	public SituationCategory() {
		// TODO Auto-generated constructor stub
	}

	public SituationCategory(long id, String name, long categoryId) {
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
		return "SituationCategory [id=" + id + ", name=" + name + ", categoryId=" + categoryId + "]";
	}
	
	
	
}
