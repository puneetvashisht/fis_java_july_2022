package com.fis.day05;


class MyRunnable implements Runnable {
	
	Integer total;
	
	public MyRunnable(Integer total) {
		this.total = total;
	}
	
	public  void decrement() {
		synchronized (MyRunnable.class) {
			this.total -= 1;
		}
		
	}

	@Override
	public void run() {
		this.decrement();
		System.out.println("Operated by " + Thread.currentThread().getName());
		System.out.println(this.total);
	}
	
}

public class RaceConditionDemo {
	
	public static void main(String[] args) {
		
		Integer totalAmountAvailable = 10000;
		Runnable runnable = new MyRunnable(totalAmountAvailable);
		
		for(int i=0;i<10000;i++) {
			Thread t = new Thread(runnable);
			t.start();
		}
		
		System.out.println();
				
		
	}

}
