package com.df.transmission.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fromCache",
    "fromDht",
    "fromIncoming",
    "fromLpd",
    "fromLtep",
    "fromPex",
    "fromTracker"
})
public class PeersFrom {

    @JsonProperty("fromCache")
    private Integer fromCache;
    @JsonProperty("fromDht")
    private Integer fromDht;
    @JsonProperty("fromIncoming")
    private Integer fromIncoming;
    @JsonProperty("fromLpd")
    private Integer fromLpd;
    @JsonProperty("fromLtep")
    private Integer fromLtep;
    @JsonProperty("fromPex")
    private Integer fromPex;
    @JsonProperty("fromTracker")
    private Integer fromTracker;

    @JsonProperty("fromCache")
    public Integer getFromCache() {
        return fromCache;
    }

    @JsonProperty("fromCache")
    public void setFromCache(Integer fromCache) {
        this.fromCache = fromCache;
    }

    @JsonProperty("fromDht")
    public Integer getFromDht() {
        return fromDht;
    }

    @JsonProperty("fromDht")
    public void setFromDht(Integer fromDht) {
        this.fromDht = fromDht;
    }

    @JsonProperty("fromIncoming")
    public Integer getFromIncoming() {
        return fromIncoming;
    }

    @JsonProperty("fromIncoming")
    public void setFromIncoming(Integer fromIncoming) {
        this.fromIncoming = fromIncoming;
    }

    @JsonProperty("fromLpd")
    public Integer getFromLpd() {
        return fromLpd;
    }

    @JsonProperty("fromLpd")
    public void setFromLpd(Integer fromLpd) {
        this.fromLpd = fromLpd;
    }

    @JsonProperty("fromLtep")
    public Integer getFromLtep() {
        return fromLtep;
    }

    @JsonProperty("fromLtep")
    public void setFromLtep(Integer fromLtep) {
        this.fromLtep = fromLtep;
    }

    @JsonProperty("fromPex")
    public Integer getFromPex() {
        return fromPex;
    }

    @JsonProperty("fromPex")
    public void setFromPex(Integer fromPex) {
        this.fromPex = fromPex;
    }

    @JsonProperty("fromTracker")
    public Integer getFromTracker() {
        return fromTracker;
    }

    @JsonProperty("fromTracker")
    public void setFromTracker(Integer fromTracker) {
        this.fromTracker = fromTracker;
    }

}
