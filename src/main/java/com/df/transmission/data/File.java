package com.df.transmission.data;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bytesCompleted",
    "length",
    "name"
})
public class File {

    @JsonProperty("bytesCompleted")
    private Long bytesCompleted;
    @JsonProperty("length")
    private Long length;
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("bytesCompleted")
    public Long getBytesCompleted() {
        return bytesCompleted;
    }

    @JsonProperty("bytesCompleted")
    public void setBytesCompleted(Long bytesCompleted) {
        this.bytesCompleted = bytesCompleted;
    }

    @JsonProperty("length")
    public Long getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(Long length) {
        this.length = length;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

}
