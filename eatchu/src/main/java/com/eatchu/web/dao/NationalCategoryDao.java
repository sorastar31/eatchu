package com.eatchu.web.dao;

import java.util.List;

import com.eatchu.web.entity.NationalCategory;


public interface NationalCategoryDao {
	int insert(NationalCategory nationalCategory);
	int update(NationalCategory nationalCategory);
	int delete(long id);
	
	NationalCategory get(long id);
	List<NationalCategory> getList();
}
