package com.epam.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SearchCriteria {
	
	private String destinationName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date minTripStartDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date maxTripStartDate;
	private String minStarRating;
	private String maxStarRating;
	private String minTotalRate;
	private String maxTotalRate;
	private String minGuestRating;
	private String maxGuestRating;

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public Date getMinTripStartDate() {
		return minTripStartDate;
	}

	public void setMinTripStartDate(Date minTripStartDate) {
		this.minTripStartDate = minTripStartDate;
	}

	public Date getMaxTripStartDate() {
		return maxTripStartDate;
	}

	public void setMaxTripStartDate(Date maxTripStartDate) {
		this.maxTripStartDate = maxTripStartDate;
	}

	public String getMinStarRating() {
		return minStarRating;
	}

	public void setMinStarRating(String minStarRating) {
		this.minStarRating = minStarRating;
	}

	public String getMaxStarRating() {
		return maxStarRating;
	}

	public void setMaxStarRating(String maxStarRating) {
		this.maxStarRating = maxStarRating;
	}

	public String getMinTotalRate() {
		return minTotalRate;
	}

	public void setMinTotalRate(String minTotalRate) {
		this.minTotalRate = minTotalRate;
	}

	public String getMaxTotalRate() {
		return maxTotalRate;
	}

	public void setMaxTotalRate(String maxTotalRate) {
		this.maxTotalRate = maxTotalRate;
	}

	public String getMinGuestRating() {
		return minGuestRating;
	}

	public void setMinGuestRating(String minGuestRating) {
		this.minGuestRating = minGuestRating;
	}

	public String getMaxGuestRating() {
		return maxGuestRating;
	}

	public void setMaxGuestRating(String maxGuestRating) {
		this.maxGuestRating = maxGuestRating;
	}

}
