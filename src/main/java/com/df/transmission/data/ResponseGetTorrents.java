package com.df.transmission.data;

import java.io.Serializable;
import java.util.List;

public class ResponseGetTorrents implements Serializable{
	private static final long serialVersionUID = 1310187482506205735L;
	
	private ArgumentsResponse arguments;
	private String result;
	private String tag;
	
	public ArgumentsResponse getArguments() {
		return arguments;
	}
	public void setArguments(ArgumentsResponse arguments) {
		this.arguments = arguments;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

}
