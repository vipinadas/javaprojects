package com.avantika.pojo;

public class Library {
	private int bookId;
	private String bookName;
	private String author;
	private String publisher;
	private int bookCost;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getBookCost() {
		return bookCost;
	}
	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}
	@Override
	public String toString() {
		return "Library [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", publisher="
				+ publisher + ", bookCost=" + bookCost + "]";
	}
	

}
