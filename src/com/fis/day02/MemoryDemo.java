package com.fis.day02;


class Number{
	public Number(int x) {
		this.x = x;
	}
	int x;
}

public class MemoryDemo {
	
	public static void m2(Number i) {

		System.out.println("M2 method");
	}
	
	
	public static void m1() {
		Number j = new Number(34);
		m2(j);
		System.out.println("M1 method");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Ends here..");
	}

}
