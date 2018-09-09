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
    "regionID",
    "associatedMultiCityRegionId",
    "longName",
    "shortName",
    "country",
    "province",
    "city",
    "tla",
    "nonLocalizedCity"
})
public class Destination {

    @JsonProperty("regionID")
    private String regionID;
    @JsonProperty("associatedMultiCityRegionId")
    private String associatedMultiCityRegionId;
    @JsonProperty("longName")
    private String longName;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("country")
    private String country;
    @JsonProperty("province")
    private String province;
    @JsonProperty("city")
    private String city;
    @JsonProperty("tla")
    private String tla;
    @JsonProperty("nonLocalizedCity")
    private String nonLocalizedCity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("regionID")
    public String getRegionID() {
        return regionID;
    }

    @JsonProperty("regionID")
    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public Destination withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    @JsonProperty("associatedMultiCityRegionId")
    public String getAssociatedMultiCityRegionId() {
        return associatedMultiCityRegionId;
    }

    @JsonProperty("associatedMultiCityRegionId")
    public void setAssociatedMultiCityRegionId(String associatedMultiCityRegionId) {
        this.associatedMultiCityRegionId = associatedMultiCityRegionId;
    }

    public Destination withAssociatedMultiCityRegionId(String associatedMultiCityRegionId) {
        this.associatedMultiCityRegionId = associatedMultiCityRegionId;
        return this;
    }

    @JsonProperty("longName")
    public String getLongName() {
        return longName;
    }

    @JsonProperty("longName")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    public Destination withLongName(String longName) {
        this.longName = longName;
        return this;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Destination withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Destination withCountry(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    public Destination withProvince(String province) {
        this.province = province;
        return this;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Destination withCity(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty("tla")
    public String getTla() {
        return tla;
    }

    @JsonProperty("tla")
    public void setTla(String tla) {
        this.tla = tla;
    }

    public Destination withTla(String tla) {
        this.tla = tla;
        return this;
    }

    @JsonProperty("nonLocalizedCity")
    public String getNonLocalizedCity() {
        return nonLocalizedCity;
    }

    @JsonProperty("nonLocalizedCity")
    public void setNonLocalizedCity(String nonLocalizedCity) {
        this.nonLocalizedCity = nonLocalizedCity;
    }

    public Destination withNonLocalizedCity(String nonLocalizedCity) {
        this.nonLocalizedCity = nonLocalizedCity;
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

    public Destination withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(regionID).append(associatedMultiCityRegionId).append(longName).append(shortName).append(country).append(province).append(city).append(tla).append(nonLocalizedCity).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Destination) == false) {
            return false;
        }
        Destination rhs = ((Destination) other);
        return new EqualsBuilder().append(regionID, rhs.regionID).append(associatedMultiCityRegionId, rhs.associatedMultiCityRegionId).append(longName, rhs.longName).append(shortName, rhs.shortName).append(country, rhs.country).append(province, rhs.province).append(city, rhs.city).append(tla, rhs.tla).append(nonLocalizedCity, rhs.nonLocalizedCity).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
