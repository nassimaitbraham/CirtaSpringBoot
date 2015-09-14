package com.cirta.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * Model de la table des Hotels
 * 
 * @author Nassim AIT BRAHAM
 *
 */
@Entity    
@Table(name="hotels")
public class Hotels {
	
	/**
	 * Attributs
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String categorie;
	private String adresse;
	private int telephone;

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param categorie
	 * @param adresse
	 * @param telephone
	 */
	public Hotels() {
		
	}

	/**
	 * Getters et Setters
	 * 
	 * @return
	 */
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}

	

}
