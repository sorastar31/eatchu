package com.eatchu.web.dao;

import java.util.List;

import com.eatchu.web.entity.Member;


public interface MemberDao {

	int insert(Member member);
	int update(Member member);
	int delete(String id);
	
	Member get(String id);
	List<Member> getList();
	List<Member> getList(int page);
	List<Member> getList(String field, String query);
	List<Member> getList(String field, String query, int page);
}
