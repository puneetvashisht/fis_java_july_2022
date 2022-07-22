package com.fis.day02;

public class Car extends Vehicle {
	
	
	

	public Car(int maxSpeed, int mileage, String model, String color) {
		super(maxSpeed, mileage, model, color);
		
	}

	public void shiftGear() {

	}

	@Override
	public String toString() {
		return "Car [maxSpeed=" + maxSpeed + ", mileage=" + mileage + ", model=" + model + ", color=" + color + "]";
	}
	
	

}
