package com.fis.day03;

public class ExceptionDemo2 {

	public static void m2(int x) throws InterruptedException, MyException {
		if(x==0)
			throw new MyException("Input is not correct");
		int result = 3/x;
		Thread.sleep(3000);
		System.out.println("m2 method..");
	}
	
	
	public static void m1() throws InterruptedException, MyException {	
		m2(0);	
		System.out.println("m1 method..");
	}

	public static void main(String[] args) {
		
		System.out.println("main method..");
//		try {
		try {
			m1();
		} 
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Y did you pass divisor as zero...");
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
//		
//		finally {
//			System.out.println("Executes always");
//		}
//		}
//		catch(ArithmeticException ae) {
//			System.out.println("Division by zero...");
//		}
		System.out.println("allz well...");
	}

}
