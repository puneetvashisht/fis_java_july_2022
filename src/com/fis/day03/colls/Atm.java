package com.fis.day03.colls;

public class Atm {
	
	int id;
	String location;
	String city;
	
	long cashCapacity;
	boolean isOperational;
	public Atm() {
		
	}
	@Override
	public String toString() {
		return "Atm [id=" + id + ", location=" + location + ", city=" + city + ", cashCapacity=" + cashCapacity
				+ ", isOperational=" + isOperational + "]";
	}
	public Atm(int id, String location, String city, long cashCapacity, boolean isOperational) {
		super();
		this.id = id;
		this.location = location;
		this.city = city;
		this.cashCapacity = cashCapacity;
		this.isOperational = isOperational;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getCashCapacity() {
		return cashCapacity;
	}
	public void setCashCapacity(long cashCapacity) {
		this.cashCapacity = cashCapacity;
	}
	public boolean isOperational() {
		return isOperational;
	}
	public void setOperational(boolean isOperational) {
		this.isOperational = isOperational;
	}
	
	

}
