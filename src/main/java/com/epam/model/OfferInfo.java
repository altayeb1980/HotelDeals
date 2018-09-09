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
    "siteID",
    "language",
    "currency",
    "userSelectedCurrency"
})
public class OfferInfo {

    @JsonProperty("siteID")
    private String siteID;
    @JsonProperty("language")
    private String language;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("userSelectedCurrency")
    private String userSelectedCurrency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("siteID")
    public String getSiteID() {
        return siteID;
    }

    @JsonProperty("siteID")
    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    public OfferInfo withSiteID(String siteID) {
        this.siteID = siteID;
        return this;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    public OfferInfo withLanguage(String language) {
        this.language = language;
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

    public OfferInfo withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("userSelectedCurrency")
    public String getUserSelectedCurrency() {
        return userSelectedCurrency;
    }

    @JsonProperty("userSelectedCurrency")
    public void setUserSelectedCurrency(String userSelectedCurrency) {
        this.userSelectedCurrency = userSelectedCurrency;
    }

    public OfferInfo withUserSelectedCurrency(String userSelectedCurrency) {
        this.userSelectedCurrency = userSelectedCurrency;
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

    public OfferInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(siteID).append(language).append(currency).append(userSelectedCurrency).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OfferInfo) == false) {
            return false;
        }
        OfferInfo rhs = ((OfferInfo) other);
        return new EqualsBuilder().append(siteID, rhs.siteID).append(language, rhs.language).append(currency, rhs.currency).append(userSelectedCurrency, rhs.userSelectedCurrency).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
