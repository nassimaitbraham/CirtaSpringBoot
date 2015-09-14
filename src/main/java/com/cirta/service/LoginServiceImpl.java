package com.cirta.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cirta.dao.AccountDao;
import com.cirta.domain.Account;


@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private AccountDao accountDao;

	@Autowired
	public String getUser() {
    	String name = "nassim";
//		Account account = accountDao.getByUserName(name);
		
		
		return name;
	}

}
