package com.fis.day04.lamdas;

public class Book {
	
	private long isbn;
	private String title;
	private double rating;
	private double price;
	private String author;
	
	public Book(long isbn, String title, double rating, double price, String author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.rating = rating;
		this.price = price;
		this.author = author;
	}
	
	
	
	public long getIsbn() {
		return isbn;
	}



	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public double getRating() {
		return rating;
	}



	public void setRating(double rating) {
		this.rating = rating;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", rating=" + rating + ", price=" + price + ", author="
				+ author + "]";
	}
	
	
	
	// Print 2 distict books with ratings > 4.5;
	// Prints books with ratings > 4.8 &  price > 500;
	// Print a boolean for any with a rating less than 2.0
	// Store the books with ratings > 8 into a sorted TreeSet (sorted by title)
	

}
