package com.fis.day02;

public class TestVehicle {

	public static void main(String[] args) {
		
		// upcasting... implicit
		Car car  = new Car(300, 20, "2020", "red");
		
		// downcasting... requires explicit cast
//		Car car1 = (Car)car;
//		System.out.println(car1);
//		car.speedUp();
//		car.shiftGear();
//		car.brakeDown();
		
		Plane plane = new Plane(1500, 43, "2022", "blue");
//		System.out.println(plane);
//		plane.speedUp();
//		plane.fly(12);
		
		Plane plane2 = new Plane(1300, 243, "2021", "blue");
//		System.out.println(plane2);
//		plane2.speedUp();
		
		
		Vehicle vehicles[] = new Vehicle[3];
		vehicles[0] = car;
		vehicles[1] = plane;
		vehicles[2] = plane2;
		
		for(Vehicle v : vehicles) {
			System.out.println(v.toString());
			v.speedUp();
		}
		
		

	}

}
