package com.cirta.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cirta.domain.Account;

/**
 * Implementation de l'interface AccountDao 
 * 
 * @author Nassim AIT BRAHAM
 *
 */

@Repository
public class AccountDaoImpl implements AccountDao{

	/**
	 * Implementation de la methode getByUserName
	 * @param username
	 * @return
	 */
	public Account getByUserName(String username) {

		return (Account) entityManager.createQuery("from Account where username = :username")
				.setParameter("username", username).getSingleResult();

	}

	// L'EntityManager va etre automatiquement injecte� a partir de
	// entityManagerFactory
	// configurer dans la class DatabaseConfig
	@PersistenceContext
	private EntityManager entityManager;

}
