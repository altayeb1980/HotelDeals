package com.expedia.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SearchCriteria {

	private String destinationName;
	private String destinationCity;
	private String regionId;
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
	private String lengthOfStay;

	private SearchCriteria() {

	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public Date getMinTripStartDate() {
		return minTripStartDate;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
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

	public String getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(String lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public static class Builder {
		private String destinationName;
		private String destinationCity;
		private String regionId;
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
		private String lengthOfStay;

		public Builder withDestinationName(String destinationName) {
			this.destinationName = destinationName;
			return this;
		}

		public Builder withDestinationCity(String destinationCity) {
			this.destinationCity = destinationCity;
			return this;
		}

		public Builder withRegionId(String regionId) {
			this.regionId = regionId;
			return this;
		}

		public Builder withMinTripStartDate(Date minTripStartDate) {
			this.minTripStartDate = minTripStartDate;
			return this;
		}

		public Builder withMaxTripStartDate(Date maxTripStartDate) {
			this.maxTripStartDate = maxTripStartDate;
			return this;
		}

		public Builder withMinStarRating(String minStarRating) {
			this.minStarRating = minStarRating;
			return this;
		}

		public Builder withMaxStarRating(String maxStarRating) {
			this.maxStarRating = maxStarRating;
			return this;
		}

		public Builder withMinTotalRate(String minTotalRate) {
			this.minTotalRate = minTotalRate;
			return this;
		}

		public Builder withMaxTotalRate(String maxTotalRate) {
			this.maxTotalRate = maxTotalRate;
			return this;
		}

		public Builder withMinGuestRating(String minGuestRating) {
			this.minGuestRating = minGuestRating;
			return this;
		}

		public Builder withMaxGuestRating(String maxGuestRating) {
			this.maxGuestRating = maxGuestRating;
			return this;
		}

		public Builder withLengthOfStay(String lengthOfStay) {
			this.lengthOfStay = lengthOfStay;
			return this;
		}

		public SearchCriteria build() {
			SearchCriteria searchCriteria = new SearchCriteria(); 
			searchCriteria.destinationCity = this.destinationCity;
			searchCriteria.destinationName = this.destinationName;
			searchCriteria.lengthOfStay = this.lengthOfStay;
			searchCriteria.maxGuestRating = this.maxGuestRating;
			searchCriteria.maxStarRating = this.maxStarRating;
			searchCriteria.maxTotalRate = this.maxTotalRate;
			searchCriteria.maxTripStartDate = this.maxTripStartDate;
			searchCriteria.minGuestRating = this.minGuestRating;
			searchCriteria.minStarRating = this.minStarRating;
			searchCriteria.minTotalRate = this.minTotalRate;
			searchCriteria.regionId = this.regionId;
			searchCriteria.minTripStartDate = this.minTripStartDate;
			return searchCriteria;
		}
	}

}
