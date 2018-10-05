package com.eatchu.web.entity.id;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StoreSituationId implements Serializable{
	
	private long storeId;
	private long situationCategoryId;
	
	public StoreSituationId() {
		// TODO Auto-generated constructor stub
	}

	public StoreSituationId(long storeId, long situationCategoryId) {
		super();
		this.storeId = storeId;
		this.situationCategoryId = situationCategoryId;
	}

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public long getSituationCategoryId() {
		return situationCategoryId;
	}

	public void setSituationCategoryId(long situationCategoryId) {
		this.situationCategoryId = situationCategoryId;
	}

	@Override
	public String toString() {
		return "StoreSituationId [storeId=" + storeId + ", situationCategoryId=" + situationCategoryId + "]";
	}
	
	
}
