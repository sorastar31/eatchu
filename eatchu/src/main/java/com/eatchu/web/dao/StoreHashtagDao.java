package com.eatchu.web.dao;

import java.util.List;

import com.eatchu.web.entity.StoreHashtag;

public interface StoreHashtagDao {
	int insert(StoreHashtag storeHashtag);
	int update(StoreHashtag storeHashtag);
	int delete(long storeId, long hashtagId);
	
	List<StoreHashtag> getList(long storeId);
}
