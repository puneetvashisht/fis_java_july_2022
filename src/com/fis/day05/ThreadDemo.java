package com.fis.day05;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
	
	public static void m1() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		m1();
		System.out.println(Thread.currentThread().getName());
		
		List<Thread> threads = new ArrayList<>();
		
		for(int i=0;i < 10;i++) {
			Thread t = new Thread(()-> {
				System.out.println(Thread.currentThread().getName());
			});
			t.start();
			threads.add(t);

		}
		
		for(Thread t : threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Back to thread: " + Thread.currentThread().getName());
	}

}
