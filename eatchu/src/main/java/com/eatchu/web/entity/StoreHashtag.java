package com.eatchu.web.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.eatchu.web.entity.id.StoreHashtagId;

@Entity
public class StoreHashtag {
	
	@EmbeddedId
	private StoreHashtagId id;
	
	public StoreHashtag() {
		// TODO Auto-generated constructor stub
	}

	public StoreHashtag(long storeId, long hashtagId) {
		super();
		this.id = new StoreHashtagId(storeId, hashtagId);
	}
	
	public long getStoreId() {
		return id.getStoreId();
	}

	public void setStoreId(long storeId) {
		id.setStoreId(storeId);
	}

	public long getHashtagId() {
		return id.getHashtagId();
	}

	public void setHashtagId(long hashtagId) {
		id.setHashtagId(hashtagId);
	}

	@Override
	public String toString() {
		return "StoreHashtag [id=" + id + ", getStoreId()=" + getStoreId() + ", getHashtagId()=" + getHashtagId() + "]";
	}
	
	
	
}
