package com.eatchu.web.dao;

import java.util.List;

import com.eatchu.web.entity.Category;

public interface CategoryDao {
	int insert(Category category);
	int update(Category category);
	int delete(long id);
	
	Category get(long id);
	List<Category> getList();
}
