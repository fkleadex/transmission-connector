package com.df.transmission.data;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlSeeAlso({Session.class})
public abstract class Margument implements Serializable{
	private static final long serialVersionUID = 2662941666827691028L;
	public Margument() {}

}
