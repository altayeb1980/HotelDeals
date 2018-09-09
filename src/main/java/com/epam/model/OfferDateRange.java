package com.epam.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "travelStartDate",
    "travelEndDate",
    "lengthOfStay"
})
public class OfferDateRange {

    @JsonProperty("travelStartDate")
    private List<Integer> travelStartDate = new ArrayList<Integer>();
    @JsonProperty("travelEndDate")
    private List<Integer> travelEndDate = new ArrayList<Integer>();
    @JsonProperty("lengthOfStay")
    private Integer lengthOfStay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("travelStartDate")
    public List<Integer> getTravelStartDate() {
        return travelStartDate;
    }

    @JsonProperty("travelStartDate")
    public void setTravelStartDate(List<Integer> travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    public OfferDateRange withTravelStartDate(List<Integer> travelStartDate) {
        this.travelStartDate = travelStartDate;
        return this;
    }

    @JsonProperty("travelEndDate")
    public List<Integer> getTravelEndDate() {
        return travelEndDate;
    }

    @JsonProperty("travelEndDate")
    public void setTravelEndDate(List<Integer> travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    public OfferDateRange withTravelEndDate(List<Integer> travelEndDate) {
        this.travelEndDate = travelEndDate;
        return this;
    }

    @JsonProperty("lengthOfStay")
    public Integer getLengthOfStay() {
        return lengthOfStay;
    }

    @JsonProperty("lengthOfStay")
    public void setLengthOfStay(Integer lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public OfferDateRange withLengthOfStay(Integer lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
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

    public OfferDateRange withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(travelStartDate).append(travelEndDate).append(lengthOfStay).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OfferDateRange) == false) {
            return false;
        }
        OfferDateRange rhs = ((OfferDateRange) other);
        return new EqualsBuilder().append(travelStartDate, rhs.travelStartDate).append(travelEndDate, rhs.travelEndDate).append(lengthOfStay, rhs.lengthOfStay).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
