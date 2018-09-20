package com.eatchu.web.dao;

import java.util.List;

import com.eatchu.web.entity.SituationCategory;

public interface SituationCategoryDao {
	int insert(SituationCategory situationCategory);
	int update(SituationCategory situationCategory);
	int delete(long id);
	
	SituationCategory get(long id);
	List<SituationCategory> getList();
}
