package com.cirta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cirta.dao.HotelsDao;
import com.cirta.domain.Hotels;

/**
 * Implementation du service Hotels
 * 
 * @author Nassim AIT BRAHAM
 *
 */

@Service
public class HotelsServiceImpl implements HotelsService{
	
	
	@Autowired
	private HotelsDao hotelDao;
	/**
	 * Implementation de la methode qui reccupere la liste de tout les hotels
	 */

	public List<Hotels> getListeHotels() {
		// TODO Auto-generated method stub
		return hotelDao.getListHotels();
	}

}
