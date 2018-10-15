package com.eatchu.web.service;

public interface AccountService {
		
	boolean isEmailDuplicated(String email);

	boolean isIdDuplicated(String id);
}
