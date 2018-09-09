package com.expedia.service;

import com.expedia.model.HotelDeal;
import com.expedia.model.SearchCriteria;

@FunctionalInterface
public interface HotelService {
	public HotelDeal findHotels(SearchCriteria searchCriteria);
}
