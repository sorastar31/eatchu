package com.eatchu.web.dao;

import java.util.List;

import com.eatchu.web.entity.StoreNational;

public interface StoreNatinalDao {
	int insert(StoreNational storeNational);
	int update(StoreNational storeNational);
	int delete(long storeId, long nationalCategoryId);
	
	List<StoreNational> getList(long storeId);
}
