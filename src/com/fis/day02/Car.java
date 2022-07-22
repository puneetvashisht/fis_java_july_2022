package com.fis.day02;

public class Car extends Vehicle {
	
	// hiding
	int maxSpeed;

	public Car(int maxSpeed, int mileage, String model, String color) {
		super(maxSpeed, mileage, model, color);
		
	}

	public void shiftGear() {
		System.out.println(super.maxSpeed);
	}

	@Override
	public String toString() {
		return "Car [maxSpeed=" + super.maxSpeed + ", mileage=" + mileage + ", model=" + model + ", color=" + color + "]";
	}
	
	

}
