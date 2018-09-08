package com.epam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.epam.model.HotelDeal;
import com.epam.model.SearchCriteria;

@Service
public class DefaultHotelService implements HotelService {

	//@Value("${hotel.deals.url}")
	private String hotelDealsUrl;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public HotelDeal findAll() {
		HotelDeal hotelDeal = restTemplate.getForObject(hotelDealsUrl, HotelDeal.class);
		return hotelDeal;
	}

	@Override
	public HotelDeal findByCriteria(SearchCriteria searchCriteria) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(hotelDealsUrl)
				// Add query parameter
				.queryParam("destinationName", searchCriteria.getDestinationName())
				.queryParam("minTripStartDate", searchCriteria.getMinTripStartDate())
				.queryParam("maxTripStartDate", searchCriteria.getMaxTripStartDate())
				.queryParam("minStarRating", searchCriteria.getMinStarRating())
				.queryParam("maxStarRating", searchCriteria.getMaxStarRating())
				.queryParam("minGuestRating", searchCriteria.getMinGuestRating())
				.queryParam("maxGuestRating", searchCriteria.getMaxGuestRating())
				.queryParam("minTotalRate", searchCriteria.getMinTotalRate())
				.queryParam("maxTotalRate", searchCriteria.getMaxTotalRate());

		HotelDeal hotelDeal = restTemplate.getForObject(builder.toUriString(), HotelDeal.class);
		return hotelDeal;
	}

	public void setHotelDealsUrl(String hotelDealsUrl) {
		this.hotelDealsUrl = hotelDealsUrl;
	}

	public String getHotelDealsUrl() {
		return hotelDealsUrl;
	}
	
	

}
