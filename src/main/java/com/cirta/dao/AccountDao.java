package com.cirta.dao;

import com.cirta.domain.Account;

/**
 * Interface AccountDao
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public interface AccountDao {
	
	/**
	 * Signature de la methode getByUserName
	 * @param username
	 * @return
	 */
	Account getByUserName(String username);

}
