package com.df.transmission.data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;


@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Arguments implements Serializable{

	private static final long serialVersionUID = -5905909109108052068L;
	
	private Fields fields;
	private List<Integer> ids;
	
	public Fields getFields() {
		return fields;
	}
	public void setFields(Fields fields) {
		this.fields = fields;
	}
	public List<Integer> getIds() {
		return ids;
	}
	public void setIds(String ids) {
		if (ids!=null) {
			String[] items=ids.split(",");
			Integer[] results = new Integer[items.length];
			for (int i = 0; i < items.length; i++) {
			    try {
			        results[i] = Integer.parseInt(items[i]);
			    } catch (NumberFormatException nfe) {
			       nfe.printStackTrace();
			    };
			}
			this.ids = Arrays.asList(results);
		}
		else {
			this.ids=null;
		}
	}
	
}
