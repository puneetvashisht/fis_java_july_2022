package com.fis.day04.lamdas;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Runing by " + Thread.currentThread().getName());
		
	}

}
