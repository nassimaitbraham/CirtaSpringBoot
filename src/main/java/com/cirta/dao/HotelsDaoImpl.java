package com.cirta.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cirta.domain.Hotels;

@Repository
public class HotelsDaoImpl implements HotelsDao  {

	
	@PersistenceContext
	private EntityManager entityManager;
	/**
	 * Implementation de la methode dao pour reccuperer la liste de tout les hotels
	 * 
	 * @return Liste des Hotels
	 */
	public List<Hotels> getListHotels() {
		
//		Hotels hotel = new Hotels(0, "La belle vue", "Place guidon",646337486);
//		List<Hotels> listeHotels = new ArrayList<Hotels>();
//		listeHotels.add(hotel);
				
		List<Hotels> listeHotels = (List<Hotels>)entityManager.createQuery("from Hotels").getResultList();
		return listeHotels;
	}

}
