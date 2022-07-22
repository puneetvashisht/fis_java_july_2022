package com.fis.day02;

public class Vehicle extends Object {
	int maxSpeed;
	int mileage;
	String model;
	// field for fuel type

	String color;
	
	
	public Vehicle() {
		
	}

	public Vehicle(int maxSpeed, int mileage, String model, String color) {
		super();
		this.maxSpeed = maxSpeed;
		this.mileage = mileage;
		this.model = model;
		this.color = color;
	}

	public void start() {

	}

	public void speedUp() {	
		System.out.println("Speed up + 5" + this.maxSpeed);
	}

	public void brakeDown() {

	}

	
}
