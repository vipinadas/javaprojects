package com.avantika.ibm;

import java.io.Serializable;

public class LibraryManagement implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int bookId;
	String bookName;
	String author;
	int price;
	Publisher publish;
	@Override
	public String toString() {
		return "LibraryManagement [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price="
				+ price + ", publish=" + publish + "]";
	}
	
	

	}



