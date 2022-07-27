package com.fis.day05;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
	
	public static void main(String[] args) {
		
		
//		/ Executors.newFixedThreadPool(10);
		ExecutorService es =new ThreadPoolExecutor(5, 10,
                         0L, TimeUnit.MILLISECONDS,
                         new ArrayBlockingQueue<Runnable>(5));
		
		
		for(int i=0;i < 15;i++) {
			Runnable runnable = new MyRunnable(100);
			es.submit(runnable);
		}
		
		
		
	}

}
