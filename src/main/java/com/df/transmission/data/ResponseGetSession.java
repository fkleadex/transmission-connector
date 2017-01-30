package com.df.transmission.data;

import java.io.Serializable;

public class ResponseGetSession implements Serializable{
	private static final long serialVersionUID = 1310187482506205735L;
	
	private Session arguments;
	private String result;
	private String tag;
	
	public Session getArguments() {
		return arguments;
	}
	public void setArguments(Session arguments) {
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
