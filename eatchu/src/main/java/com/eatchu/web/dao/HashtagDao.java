package com.eatchu.web.dao;

import java.util.List;

import com.eatchu.web.entity.Hashtag;

public interface HashtagDao {
	int insert(Hashtag hashtag);
	int update(Hashtag hashtag);
	int delete(long id);
	
	Hashtag get(long id);
	List<Hashtag> getList();
}
