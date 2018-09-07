package com.epam.service;

import com.epam.model.HotelDeal;
import com.epam.model.SearchCriteria;

public interface HotelService {

	public HotelDeal findAll();
	public HotelDeal findByCriteria(SearchCriteria searchCriteria);
	
	
	
}
