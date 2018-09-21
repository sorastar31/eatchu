package com.eatchu.web.dao;

import java.util.List;

import com.eatchu.web.entity.StorePhoto;

public interface StorePhotoDao {
	int insert(StorePhoto storePhoto);
	int update(StorePhoto storePhoto);
	int delete(long id);
	
	StorePhoto get(long id);
	List<StorePhoto> getList();
}
