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
    "averagePriceValue",
    "totalPriceValue",
    "crossOutPriceValue",
    "originalPricePerNight",
    "currency",
    "percentSavings",
    "drr"
})
public class HotelPricingInfo {

    @JsonProperty("averagePriceValue")
    private Double averagePriceValue;
    @JsonProperty("totalPriceValue")
    private Double totalPriceValue;
    @JsonProperty("crossOutPriceValue")
    private Double crossOutPriceValue;
    @JsonProperty("originalPricePerNight")
    private Double originalPricePerNight;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("percentSavings")
    private Double percentSavings;
    @JsonProperty("drr")
    private Boolean drr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("averagePriceValue")
    public Double getAveragePriceValue() {
        return averagePriceValue;
    }

    @JsonProperty("averagePriceValue")
    public void setAveragePriceValue(Double averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    public HotelPricingInfo withAveragePriceValue(Double averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
        return this;
    }

    @JsonProperty("totalPriceValue")
    public Double getTotalPriceValue() {
        return totalPriceValue;
    }

    @JsonProperty("totalPriceValue")
    public void setTotalPriceValue(Double totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    public HotelPricingInfo withTotalPriceValue(Double totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
        return this;
    }

    @JsonProperty("crossOutPriceValue")
    public Double getCrossOutPriceValue() {
        return crossOutPriceValue;
    }

    @JsonProperty("crossOutPriceValue")
    public void setCrossOutPriceValue(Double crossOutPriceValue) {
        this.crossOutPriceValue = crossOutPriceValue;
    }

    public HotelPricingInfo withCrossOutPriceValue(Double crossOutPriceValue) {
        this.crossOutPriceValue = crossOutPriceValue;
        return this;
    }

    @JsonProperty("originalPricePerNight")
    public Double getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    @JsonProperty("originalPricePerNight")
    public void setOriginalPricePerNight(Double originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    public HotelPricingInfo withOriginalPricePerNight(Double originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
        return this;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public HotelPricingInfo withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("percentSavings")
    public Double getPercentSavings() {
        return percentSavings;
    }

    @JsonProperty("percentSavings")
    public void setPercentSavings(Double percentSavings) {
        this.percentSavings = percentSavings;
    }

    public HotelPricingInfo withPercentSavings(Double percentSavings) {
        this.percentSavings = percentSavings;
        return this;
    }

    @JsonProperty("drr")
    public Boolean getDrr() {
        return drr;
    }

    @JsonProperty("drr")
    public void setDrr(Boolean drr) {
        this.drr = drr;
    }

    public HotelPricingInfo withDrr(Boolean drr) {
        this.drr = drr;
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

    public HotelPricingInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(averagePriceValue).append(totalPriceValue).append(crossOutPriceValue).append(originalPricePerNight).append(currency).append(percentSavings).append(drr).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HotelPricingInfo) == false) {
            return false;
        }
        HotelPricingInfo rhs = ((HotelPricingInfo) other);
        return new EqualsBuilder().append(averagePriceValue, rhs.averagePriceValue).append(totalPriceValue, rhs.totalPriceValue).append(crossOutPriceValue, rhs.crossOutPriceValue).append(originalPricePerNight, rhs.originalPricePerNight).append(currency, rhs.currency).append(percentSavings, rhs.percentSavings).append(drr, rhs.drr).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
