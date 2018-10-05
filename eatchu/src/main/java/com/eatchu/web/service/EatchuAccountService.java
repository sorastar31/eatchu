package com.eatchu.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eatchu.web.dao.MemberDao;
import com.eatchu.web.entity.Member;

@Service
public class EatchuAccountService implements AccountService {
	
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public boolean isEmailDuplicated(String email) {
		
		Member member = memberDao.getByEmail(email);
		
		if(member != null)
			return true;
		
		return false;
	}
	
}
