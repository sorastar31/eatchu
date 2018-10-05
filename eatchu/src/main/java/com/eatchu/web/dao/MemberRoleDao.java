package com.eatchu.web.dao;

import java.util.List;

import com.eatchu.web.entity.Member;
import com.eatchu.web.entity.MemberRole;

public interface MemberRoleDao {
	int insert(MemberRole memberRole);
	int update(MemberRole memberRole);
	int delete(MemberRole memberRole);
	
	List<MemberRole> getList();
	List<MemberRole> getList(String memberId);
}
