package com.fis.fisreservationbookinservice;

public class ReservationBean {
int id;
	
	String source;
	String destination;
	double price;
	double totalPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "ReservationBean [id=" + id + ", source=" + source + ", destination=" + destination + ", price=" + price
				+ ", totalPrice=" + totalPrice + "]";
	}
	
	
	
	
}
