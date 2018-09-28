package com.eatchu.web.dao;

import java.util.List;

import com.eatchu.web.entity.Friend;

public interface FriendDao {
	int insert(Friend friend);
	int update(Friend friend);
	int delete(long regId, long friendId);
	
	List<Friend> getList();
	List<Friend> getList(long regId);
}
