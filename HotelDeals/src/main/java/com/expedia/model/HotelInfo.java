package com.expedia.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hotelId",
    "hotelName",
    "localizedHotelName",
    "hotelDestination",
    "hotelDestinationRegionID",
    "hotelLongDestination",
    "hotelStreetAddress",
    "hotelCity",
    "hotelProvince",
    "hotelCountryCode",
    "hotelLatitude",
    "hotelLongitude",
    "hotelStarRating",
    "hotelGuestReviewRating",
    "hotelReviewTotal",
    "hotelImageUrl",
    "vipAccess",
    "isOfficialRating"
})
public class HotelInfo {

    @JsonProperty("hotelId")
    private String hotelId;
    @JsonProperty("hotelName")
    private String hotelName;
    @JsonProperty("localizedHotelName")
    private String localizedHotelName;
    @JsonProperty("hotelDestination")
    private String hotelDestination;
    @JsonProperty("hotelDestinationRegionID")
    private String hotelDestinationRegionID;
    @JsonProperty("hotelLongDestination")
    private String hotelLongDestination;
    @JsonProperty("hotelStreetAddress")
    private String hotelStreetAddress;
    @JsonProperty("hotelCity")
    private String hotelCity;
    @JsonProperty("hotelProvince")
    private String hotelProvince;
    @JsonProperty("hotelCountryCode")
    private String hotelCountryCode;
    @JsonProperty("hotelLatitude")
    private Double hotelLatitude;
    @JsonProperty("hotelLongitude")
    private Double hotelLongitude;
    @JsonProperty("hotelStarRating")
    private String hotelStarRating;
    @JsonProperty("hotelGuestReviewRating")
    private Double hotelGuestReviewRating;
    @JsonProperty("hotelReviewTotal")
    private Integer hotelReviewTotal;
    @JsonProperty("hotelImageUrl")
    private String hotelImageUrl;
    @JsonProperty("vipAccess")
    private Boolean vipAccess;
    @JsonProperty("isOfficialRating")
    private Boolean isOfficialRating;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hotelId")
    public String getHotelId() {
        return hotelId;
    }

    @JsonProperty("hotelId")
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public HotelInfo withHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }

    @JsonProperty("hotelName")
    public String getHotelName() {
        return hotelName;
    }

    @JsonProperty("hotelName")
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public HotelInfo withHotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }

    @JsonProperty("localizedHotelName")
    public String getLocalizedHotelName() {
        return localizedHotelName;
    }

    @JsonProperty("localizedHotelName")
    public void setLocalizedHotelName(String localizedHotelName) {
        this.localizedHotelName = localizedHotelName;
    }

    public HotelInfo withLocalizedHotelName(String localizedHotelName) {
        this.localizedHotelName = localizedHotelName;
        return this;
    }

    @JsonProperty("hotelDestination")
    public String getHotelDestination() {
        return hotelDestination;
    }

    @JsonProperty("hotelDestination")
    public void setHotelDestination(String hotelDestination) {
        this.hotelDestination = hotelDestination;
    }

    public HotelInfo withHotelDestination(String hotelDestination) {
        this.hotelDestination = hotelDestination;
        return this;
    }

    @JsonProperty("hotelDestinationRegionID")
    public String getHotelDestinationRegionID() {
        return hotelDestinationRegionID;
    }

    @JsonProperty("hotelDestinationRegionID")
    public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
        this.hotelDestinationRegionID = hotelDestinationRegionID;
    }

    public HotelInfo withHotelDestinationRegionID(String hotelDestinationRegionID) {
        this.hotelDestinationRegionID = hotelDestinationRegionID;
        return this;
    }

    @JsonProperty("hotelLongDestination")
    public String getHotelLongDestination() {
        return hotelLongDestination;
    }

    @JsonProperty("hotelLongDestination")
    public void setHotelLongDestination(String hotelLongDestination) {
        this.hotelLongDestination = hotelLongDestination;
    }

    public HotelInfo withHotelLongDestination(String hotelLongDestination) {
        this.hotelLongDestination = hotelLongDestination;
        return this;
    }

    @JsonProperty("hotelStreetAddress")
    public String getHotelStreetAddress() {
        return hotelStreetAddress;
    }

    @JsonProperty("hotelStreetAddress")
    public void setHotelStreetAddress(String hotelStreetAddress) {
        this.hotelStreetAddress = hotelStreetAddress;
    }

    public HotelInfo withHotelStreetAddress(String hotelStreetAddress) {
        this.hotelStreetAddress = hotelStreetAddress;
        return this;
    }

    @JsonProperty("hotelCity")
    public String getHotelCity() {
        return hotelCity;
    }

    @JsonProperty("hotelCity")
    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public HotelInfo withHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
        return this;
    }

    @JsonProperty("hotelProvince")
    public String getHotelProvince() {
        return hotelProvince;
    }

    @JsonProperty("hotelProvince")
    public void setHotelProvince(String hotelProvince) {
        this.hotelProvince = hotelProvince;
    }

    public HotelInfo withHotelProvince(String hotelProvince) {
        this.hotelProvince = hotelProvince;
        return this;
    }

    @JsonProperty("hotelCountryCode")
    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    @JsonProperty("hotelCountryCode")
    public void setHotelCountryCode(String hotelCountryCode) {
        this.hotelCountryCode = hotelCountryCode;
    }

    public HotelInfo withHotelCountryCode(String hotelCountryCode) {
        this.hotelCountryCode = hotelCountryCode;
        return this;
    }

    @JsonProperty("hotelLatitude")
    public Double getHotelLatitude() {
        return hotelLatitude;
    }

    @JsonProperty("hotelLatitude")
    public void setHotelLatitude(Double hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
    }

    public HotelInfo withHotelLatitude(Double hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
        return this;
    }

    @JsonProperty("hotelLongitude")
    public Double getHotelLongitude() {
        return hotelLongitude;
    }

    @JsonProperty("hotelLongitude")
    public void setHotelLongitude(Double hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
    }

    public HotelInfo withHotelLongitude(Double hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
        return this;
    }

    @JsonProperty("hotelStarRating")
    public String getHotelStarRating() {
        return hotelStarRating;
    }

    @JsonProperty("hotelStarRating")
    public void setHotelStarRating(String hotelStarRating) {
        this.hotelStarRating = hotelStarRating;
    }

    public HotelInfo withHotelStarRating(String hotelStarRating) {
        this.hotelStarRating = hotelStarRating;
        return this;
    }

    @JsonProperty("hotelGuestReviewRating")
    public Double getHotelGuestReviewRating() {
        return hotelGuestReviewRating;
    }

    @JsonProperty("hotelGuestReviewRating")
    public void setHotelGuestReviewRating(Double hotelGuestReviewRating) {
        this.hotelGuestReviewRating = hotelGuestReviewRating;
    }

    public HotelInfo withHotelGuestReviewRating(Double hotelGuestReviewRating) {
        this.hotelGuestReviewRating = hotelGuestReviewRating;
        return this;
    }

    @JsonProperty("hotelReviewTotal")
    public Integer getHotelReviewTotal() {
        return hotelReviewTotal;
    }

    @JsonProperty("hotelReviewTotal")
    public void setHotelReviewTotal(Integer hotelReviewTotal) {
        this.hotelReviewTotal = hotelReviewTotal;
    }

    public HotelInfo withHotelReviewTotal(Integer hotelReviewTotal) {
        this.hotelReviewTotal = hotelReviewTotal;
        return this;
    }

    @JsonProperty("hotelImageUrl")
    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    @JsonProperty("hotelImageUrl")
    public void setHotelImageUrl(String hotelImageUrl) {
        this.hotelImageUrl = hotelImageUrl;
    }

    public HotelInfo withHotelImageUrl(String hotelImageUrl) {
        this.hotelImageUrl = hotelImageUrl;
        return this;
    }

    @JsonProperty("vipAccess")
    public Boolean getVipAccess() {
        return vipAccess;
    }

    @JsonProperty("vipAccess")
    public void setVipAccess(Boolean vipAccess) {
        this.vipAccess = vipAccess;
    }

    public HotelInfo withVipAccess(Boolean vipAccess) {
        this.vipAccess = vipAccess;
        return this;
    }

    @JsonProperty("isOfficialRating")
    public Boolean getIsOfficialRating() {
        return isOfficialRating;
    }

    @JsonProperty("isOfficialRating")
    public void setIsOfficialRating(Boolean isOfficialRating) {
        this.isOfficialRating = isOfficialRating;
    }

    public HotelInfo withIsOfficialRating(Boolean isOfficialRating) {
        this.isOfficialRating = isOfficialRating;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public HotelInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hotelId).append(hotelName).append(localizedHotelName).append(hotelDestination).append(hotelDestinationRegionID).append(hotelLongDestination).append(hotelStreetAddress).append(hotelCity).append(hotelProvince).append(hotelCountryCode).append(hotelLatitude).append(hotelLongitude).append(hotelStarRating).append(hotelGuestReviewRating).append(hotelReviewTotal).append(hotelImageUrl).append(vipAccess).append(isOfficialRating).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HotelInfo) == false) {
            return false;
        }
        HotelInfo rhs = ((HotelInfo) other);
        return new EqualsBuilder().append(hotelId, rhs.hotelId).append(hotelName, rhs.hotelName).append(localizedHotelName, rhs.localizedHotelName).append(hotelDestination, rhs.hotelDestination).append(hotelDestinationRegionID, rhs.hotelDestinationRegionID).append(hotelLongDestination, rhs.hotelLongDestination).append(hotelStreetAddress, rhs.hotelStreetAddress).append(hotelCity, rhs.hotelCity).append(hotelProvince, rhs.hotelProvince).append(hotelCountryCode, rhs.hotelCountryCode).append(hotelLatitude, rhs.hotelLatitude).append(hotelLongitude, rhs.hotelLongitude).append(hotelStarRating, rhs.hotelStarRating).append(hotelGuestReviewRating, rhs.hotelGuestReviewRating).append(hotelReviewTotal, rhs.hotelReviewTotal).append(hotelImageUrl, rhs.hotelImageUrl).append(vipAccess, rhs.vipAccess).append(isOfficialRating, rhs.isOfficialRating).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
