package com.eatchu.web.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class StoreNational {
	
	@EmbeddedId
	private StoreNationalId id;
	
	
	public StoreNational() {
		// TODO Auto-generated constructor stub
	}


	public StoreNational(long storeId, long nationalCategoryId) {
		super();
		this.id = new StoreNationalId(storeId, nationalCategoryId);
	}
	

	public long getStoreId() {
		return id.getStoreId();
	}

	public void setStoreId(long storeId) {
		id.setStoreId(storeId);
	}

	public long getNationalCategoryId() {
		return id.getNationalCategoryId();
	}

	public void setNationalCategoryId(long nationalCategoryId) {
		id.setNationalCategoryId(nationalCategoryId);
	}


	@Override
	public String toString() {
		return "StoreNational [id=" + id + ", getStoreId()=" + getStoreId() + ", getNationalCategoryId()="
				+ getNationalCategoryId() + "]";
	}
	
	
}
