package com.eatchu.web.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class StoreSituation {

	@EmbeddedId
	private StoreSituationId id;
	
	public StoreSituation() {
		// TODO Auto-generated constructor stub
	}

	public StoreSituation(long storeId, long situationCategoryId) {
		super();
		this.id = new StoreSituationId(storeId, situationCategoryId);
	}
	
	public long getStoreId() {
		return id.getStoreId();
	}

	public void setStoreId(long storeId) {
		id.setStoreId(storeId);
	}

	public long getSituationCategoryId() {
		return id.getSituationCategoryId();
	}

	public void setSituationCategoryId(long situationCategoryId) {
		id.setSituationCategoryId(situationCategoryId);
	}

	@Override
	public String toString() {
		return "StoreSituation [id=" + id + ", getStoreId()=" + getStoreId() + ", getSituationCategoryId()="
				+ getSituationCategoryId() + "]";
	}

}
