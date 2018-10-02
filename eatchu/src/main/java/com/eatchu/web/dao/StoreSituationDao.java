package com.eatchu.web.dao;

import java.util.List;

import com.eatchu.web.entity.StoreSituation;

public interface StoreSituationDao {
	int insert(StoreSituation storeSituation);
	int update(StoreSituation storeSituation);
	int delete(long storeId, long situationCategoryId);
	
	List<StoreSituation> getList(long storeId);
}
