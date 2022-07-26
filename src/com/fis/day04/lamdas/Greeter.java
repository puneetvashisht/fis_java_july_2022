package com.fis.day04.lamdas;

public class Greeter {

	public static void main(String[] args) {
		
		Greeting helloInEnglish = new EnglishGreeting();
		helloInEnglish.perform();
		
		
		Greeting helloInJapanese  = new JapaneseGreeting();
		helloInJapanese.perform();
		
		
		// Anonymous Class
		Greeting helloInHindi = new Greeting() {
			@Override
			public void perform() {
				System.out.println("Namashkar!");
				
			}	
		};
		helloInHindi.perform();
		
//		void perform();
		
		// Lamdas
		Greeting helloInFrench = () ->  System.out.println("Bonjour!");
		helloInFrench.perform();
		
		
		Runnable r = ()-> System.out.println("Runing by " + Thread.currentThread().getName());
		
		Thread t = new Thread(r);
		t.start();
		

	}

}
