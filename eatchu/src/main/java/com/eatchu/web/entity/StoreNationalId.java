package com.eatchu.web.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StoreNationalId implements Serializable{
	
	private long storeId;
	private long nationalCategoryId;
	
	public StoreNationalId() {
		// TODO Auto-generated constructor stub
	}

	public StoreNationalId(long storeId, long nationalCategoryId) {
		super();
		this.storeId = storeId;
		this.nationalCategoryId = nationalCategoryId;
	}

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public long getNationalCategoryId() {
		return nationalCategoryId;
	}

	public void setNationalCategoryId(long nationalCategoryId) {
		this.nationalCategoryId = nationalCategoryId;
	}

	@Override
	public String toString() {
		return "StoreNationalId [storeId=" + storeId + ", nationalCategoryId=" + nationalCategoryId + "]";
	}
	
	
}
