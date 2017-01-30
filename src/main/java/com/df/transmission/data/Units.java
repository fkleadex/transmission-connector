package com.df.transmission.data;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "memory-bytes", "memory-units", "size-bytes", "size-units", "speed-bytes", "speed-units" })
public class Units {

	@JsonProperty("memory-bytes")
	private Integer memoryBytes;
	@JsonProperty("memory-units")
	private List<String> memoryUnits = null;
	@JsonProperty("size-bytes")
	private Integer sizeBytes;
	@JsonProperty("size-units")
	private List<String> sizeUnits = null;
	@JsonProperty("speed-bytes")
	private Integer speedBytes;
	@JsonProperty("speed-units")
	private List<String> speedUnits = null;

	@JsonProperty("memory-bytes")
	public Integer getMemoryBytes() {
		return memoryBytes;
	}

	@JsonProperty("memory-bytes")
	public void setMemoryBytes(Integer memoryBytes) {
		this.memoryBytes = memoryBytes;
	}

	@JsonProperty("memory-units")
	public List<String> getMemoryUnits() {
		return memoryUnits;
	}

	@JsonProperty("memory-units")
	public void setMemoryUnits(List<String> memoryUnits) {
		this.memoryUnits = memoryUnits;
	}

	@JsonProperty("size-bytes")
	public Integer getSizeBytes() {
		return sizeBytes;
	}

	@JsonProperty("size-bytes")
	public void setSizeBytes(Integer sizeBytes) {
		this.sizeBytes = sizeBytes;
	}

	@JsonProperty("size-units")
	public List<String> getSizeUnits() {
		return sizeUnits;
	}

	@JsonProperty("size-units")
	public void setSizeUnits(List<String> sizeUnits) {
		this.sizeUnits = sizeUnits;
	}

	@JsonProperty("speed-bytes")
	public Integer getSpeedBytes() {
		return speedBytes;
	}

	@JsonProperty("speed-bytes")
	public void setSpeedBytes(Integer speedBytes) {
		this.speedBytes = speedBytes;
	}

	@JsonProperty("speed-units")
	public List<String> getSpeedUnits() {
		return speedUnits;
	}

	@JsonProperty("speed-units")
	public void setSpeedUnits(List<String> speedUnits) {
		this.speedUnits = speedUnits;
	}

}
