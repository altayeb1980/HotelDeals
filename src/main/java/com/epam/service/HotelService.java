package com.epam.service;

import com.epam.model.HotelDeal;
import com.epam.model.SearchCriteria;

@FunctionalInterface
public interface HotelService {
	public HotelDeal findHotels(SearchCriteria searchCriteria);
}
