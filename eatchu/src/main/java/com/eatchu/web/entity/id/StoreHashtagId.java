package com.eatchu.web.entity.id;

import javax.persistence.Embeddable;

@Embeddable
public class StoreHashtagId {
	
	private long storeId;
	private long hashtagId;
	
	public StoreHashtagId() {
		super();
	}
	
	public StoreHashtagId(long storeId, long hashtagId) {
		super();
		this.storeId = storeId;
		this.hashtagId = hashtagId;
	}

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public long getHashtagId() {
		return hashtagId;
	}

	public void setHashtagId(long hashtagId) {
		this.hashtagId = hashtagId;
	}

	@Override
	public String toString() {
		return "StoreHashtagId [storeId=" + storeId + ", hashtagId=" + hashtagId + "]";
	}
	
	
	
}
