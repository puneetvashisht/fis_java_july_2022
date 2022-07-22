package com.fis.day02;

public class TestVehicle {

	public static void main(String[] args) {
		Car car  = new Car(300, 20, "2020", "red");
		System.out.println(car);
		car.speedUp();
//		car.shiftGear();
//		car.brakeDown();
		
		Plane plane = new Plane(1500, 43, "2022", "blue");
		System.out.println(plane);
		plane.speedUp();
		plane.fly(12);

	}

}
