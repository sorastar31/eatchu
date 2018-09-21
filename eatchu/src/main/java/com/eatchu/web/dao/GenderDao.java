package com.eatchu.web.dao;

import java.util.List;

import com.eatchu.web.entity.Gender;

public interface GenderDao {
	int insert(Gender gender);
	int update(Gender gender);
	int delete(int id);
	
	Gender get(int id);
	List<Gender> getList();
}
