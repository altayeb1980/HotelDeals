package com.epam.service;

import java.text.SimpleDateFormat;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.epam.model.HotelDeal;
import com.epam.model.SearchCriteria;

@Service
public class DefaultHotelService implements HotelService {

	@Value("${hotel.deals.url}")
	private String hotelDealsUrl;

	@Autowired
	private RestTemplate restTemplate;


	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public HotelDeal findHotels(SearchCriteria searchCriteria) {
		buildUriWithNeededParams(searchCriteria);
		String uriWithParam = buildUriWithNeededParams(searchCriteria);
		HotelDeal hotelDeal = restTemplate.getForObject(uriWithParam, HotelDeal.class);
		return hotelDeal;
	}

	public String buildUriWithNeededParams(SearchCriteria searchCriteria) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(hotelDealsUrl);
		if (StringUtils.isNotEmpty(searchCriteria.getDestinationName())) {
			builder.queryParam("destinationName", searchCriteria.getDestinationName());
		}
		if (StringUtils.isNotEmpty(searchCriteria.getLengthOfStay())) {
			builder.queryParam("lengthOfStay", searchCriteria.getLengthOfStay());
		}
		if (searchCriteria.getMinTripStartDate() != null) {
			builder.queryParam("minTripStartDate", formatter.format(searchCriteria.getMinTripStartDate()));
		}
		if (searchCriteria.getMaxTripStartDate() != null) {
			builder.queryParam("maxTripStartDate", formatter.format(searchCriteria.getMaxTripStartDate()));
		}
		if (StringUtils.isNotEmpty(searchCriteria.getMinStarRating())) {
			builder.queryParam("minStarRating", searchCriteria.getMinStarRating());
		}
		if (StringUtils.isNotEmpty(searchCriteria.getMaxStarRating())) {
			builder.queryParam("maxStarRating", searchCriteria.getMaxStarRating());
		}
		if (StringUtils.isNotEmpty(searchCriteria.getMinGuestRating())) {
			builder.queryParam("minGuestRating", searchCriteria.getMinGuestRating());
		}
		if (StringUtils.isNotEmpty(searchCriteria.getMaxGuestRating())) {
			builder.queryParam("maxGuestRating", searchCriteria.getMaxGuestRating());
		}
		if (StringUtils.isNotEmpty(searchCriteria.getMinTotalRate())) {
			builder.queryParam("minTotalRate", searchCriteria.getMinTotalRate());
		}
		if (StringUtils.isNotEmpty(searchCriteria.getMaxTotalRate())) {
			builder.queryParam("maxTotalRate", searchCriteria.getMaxTotalRate());
		}
		return builder.toUriString();
	}

	public void setHotelDealsUrl(String hotelDealsUrl) {
		this.hotelDealsUrl = hotelDealsUrl;
	}
}
