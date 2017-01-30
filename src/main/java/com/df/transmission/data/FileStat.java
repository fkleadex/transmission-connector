package com.df.transmission.data;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bytesCompleted",
    "priority",
    "wanted"
})
public class FileStat {

    @JsonProperty("bytesCompleted")
    private Long bytesCompleted;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("wanted")
    private Boolean wanted;

    @JsonProperty("bytesCompleted")
    public Long getBytesCompleted() {
        return bytesCompleted;
    }

    @JsonProperty("bytesCompleted")
    public void setBytesCompleted(Long bytesCompleted) {
        this.bytesCompleted = bytesCompleted;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("wanted")
    public Boolean getWanted() {
        return wanted;
    }

    @JsonProperty("wanted")
    public void setWanted(Boolean wanted) {
        this.wanted = wanted;
    }

}
