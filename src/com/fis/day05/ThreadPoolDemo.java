package com.fis.day05;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


class MyCallable implements Callable<Integer>{
	Integer total;
	
	public MyCallable(Integer total) {
		this.total = total;
	}
	
	public int decrement() {
		synchronized (this) {
			this.total -= 1;
			return this.total;
		}	
	}
	@Override
	public Integer call() throws Exception {
		return decrement();
	}
	
}

public class ThreadPoolDemo {
	
	public static void main(String[] args) {
		
		
//		/ Executors.newFixedThreadPool(10);
		ExecutorService es =new ThreadPoolExecutor(5, 5,
                         0L, TimeUnit.MILLISECONDS,
                         new ArrayBlockingQueue<Runnable>(5));
		
		Callable<Integer> callable = new MyCallable(100);
		for(int i=0;i < 100;i++) {
			Future<Integer> future = es.submit(callable);
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
