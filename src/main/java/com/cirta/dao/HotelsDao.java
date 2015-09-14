package com.cirta.dao;

import java.util.List;

import com.cirta.domain.Hotels;

/**
 * Interface pour reccuperer la liste des hotels
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public interface HotelsDao {
	
	/**
	 * Signature de la methode qui reccupere toute la liste des hotels
	 * 
	 * @return Liste des Hotels
	 */
	List<Hotels> getListHotels();

}
