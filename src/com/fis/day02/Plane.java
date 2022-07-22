package com.fis.day02;

public class Plane extends Vehicle{
	
//	public Plane() {
//		super();
//	}
//	
	
	int maxAltitude;
	
	public Plane(int maxSpeed, int mileage, String model,String color) {
		this(maxSpeed, mileage, model, color, 12000);
		
	}
	public Plane(int maxSpeed, int mileage, String model, String color, int maxAltitude) {
		super(maxSpeed, mileage, model, color);
//		this.maxSpeed = maxSpeed;
		this.maxAltitude = maxAltitude;
		
	}
	
	public void fly() {
		
	}
	
	public int fly(int altitude) {
		return 1;
	}
	
	@Override
	public void speedUp() {	
//		super.speedUp();
		System.out.println("Speed up + 50");
	}
	


	@Override
	public String toString() {
		return "Plane [maxAltitude=" + maxAltitude + ", maxSpeed=" + maxSpeed + ", mileage=" + mileage + ", model="
				+ model + ", color=" + color + "]";
	}

	
	
	

}
