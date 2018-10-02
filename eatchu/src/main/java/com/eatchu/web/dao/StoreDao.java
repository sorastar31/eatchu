package com.eatchu.web.dao;

import java.util.List;

import com.eatchu.web.entity.Store;

public interface StoreDao {
	int insert(Store store);
	int update(Store store);
	int delete(long id);
	
	Store get(long id);
	List<Store> getList();
	List<Store> getList(long regId);
	
}
