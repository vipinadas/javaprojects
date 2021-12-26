package com.avantika.ibm;

import java.io.Serializable;

public class Publisher implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String publisherName;
	short vol;
	String date;
	@Override
	public String toString() {
		return "Publisher [publisherName=" + publisherName + ", vol=" + vol + ", date=" + date + "]";
	}
}
