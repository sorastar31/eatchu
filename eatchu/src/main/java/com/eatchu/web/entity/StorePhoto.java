package com.eatchu.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StorePhoto {
		
	@Id
	private long id;
	private String content;
	private long storeId;
	
	public StorePhoto() {
		// TODO Auto-generated constructor stub
	}

	public StorePhoto(long id, String content, long storeId) {
		super();
		this.id = id;
		this.content = content;
		this.storeId = storeId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "StorePhoto [id=" + id + ", content=" + content + ", storeId=" + storeId + "]";
	}
	
	
}
