package com.fis.day03;

public class ExceptionDemo {
	
	public static final int ELIGIBILITY_AGE = 18;
	
	public static void vote(int age) throws MyException {	
		if(age < ELIGIBILITY_AGE)
			throw new MyException("Not eligble...");
	}
	

	public static void main(String[] args) {
//		try {
//			vote(14);
//		} catch (MyException e) {
//			e.printStackTrace();
//			System.out.println("Send person to jail");
//		}
		System.out.println("Allz well.. that ends well..");

	}

}
