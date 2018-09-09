package com.epam.model;

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
    "offerDateRange",
    "destination",
    "hotelInfo",
    "hotelPricingInfo",
    "hotelUrls"
})
public class Hotel {

    @JsonProperty("offerDateRange")
    private OfferDateRange offerDateRange;
    @JsonProperty("destination")
    private Destination destination;
    @JsonProperty("hotelInfo")
    private HotelInfo hotelInfo;
    @JsonProperty("hotelPricingInfo")
    private HotelPricingInfo hotelPricingInfo;
    @JsonProperty("hotelUrls")
    private HotelUrls hotelUrls;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("offerDateRange")
    public OfferDateRange getOfferDateRange() {
        return offerDateRange;
    }

    @JsonProperty("offerDateRange")
    public void setOfferDateRange(OfferDateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    public Hotel withOfferDateRange(OfferDateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
        return this;
    }

    @JsonProperty("destination")
    public Destination getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Hotel withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

    @JsonProperty("hotelInfo")
    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    @JsonProperty("hotelInfo")
    public void setHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public Hotel withHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
        return this;
    }

    @JsonProperty("hotelPricingInfo")
    public HotelPricingInfo getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    @JsonProperty("hotelPricingInfo")
    public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    public Hotel withHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
        return this;
    }

    @JsonProperty("hotelUrls")
    public HotelUrls getHotelUrls() {
        return hotelUrls;
    }

    @JsonProperty("hotelUrls")
    public void setHotelUrls(HotelUrls hotelUrls) {
        this.hotelUrls = hotelUrls;
    }

    public Hotel withHotelUrls(HotelUrls hotelUrls) {
        this.hotelUrls = hotelUrls;
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

    public Hotel withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(offerDateRange).append(destination).append(hotelInfo).append(hotelPricingInfo).append(hotelUrls).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hotel) == false) {
            return false;
        }
        Hotel rhs = ((Hotel) other);
        return new EqualsBuilder().append(offerDateRange, rhs.offerDateRange).append(destination, rhs.destination).append(hotelInfo, rhs.hotelInfo).append(hotelPricingInfo, rhs.hotelPricingInfo).append(hotelUrls, rhs.hotelUrls).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
