package com.eatchu.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.eatchu.web.dao.MemberDao;
import com.eatchu.web.entity.Member;

public class MybatisMemberDao implements MemberDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(Member member) {
		
		
		
		return 0;
	}

	@Override
	public int update(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getList(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getList(String field, String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getList(String field, String query, int page) {
		// TODO Auto-generated method stub
		return null;
	}

}
