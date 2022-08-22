package com.fis.day05;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableExample implements Callable<Integer>
{
  
  public Integer call() throws Exception
  {
    Random generator = new Random();
    Integer randomNumber = generator.nextInt(5);
  
    Thread.sleep(randomNumber * 1000);
  
    return randomNumber;
  }
  
}
public class ExecutorCallable {
	public static void main(String[] args) throws Exception
	  {
	  
	  ExecutorService service = Executors.newFixedThreadPool(2);
	  
	    for (int i = 0; i < 5; i++)
	    {
	      Callable<Integer> callable = new CallableExample();
	  
	      Future<Integer> f = service.submit(callable);
	      System.out.println(f.get());
	    }
	  
	    service.shutdown();
	  }
}
