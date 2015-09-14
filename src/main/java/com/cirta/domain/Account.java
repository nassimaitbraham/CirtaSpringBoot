package com.cirta.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Model de la table account
 * 
 * @author Nassim AIT BRAHAM
 * 
 */
@Entity
@Table(name = "account")
public class Account {

	/**
	 * Attributs
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String password;

	// Faut toujours mettre un constructeur par defaut
	public Account() {

	}

	public Account(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/**
	 * 
	 * Getters et Setters
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
