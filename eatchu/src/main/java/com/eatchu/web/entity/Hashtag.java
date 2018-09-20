package com.eatchu.web.entity;

public class Hashtag {
	
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
