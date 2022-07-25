package com.fis.day03;

import java.util.ArrayList;
import java.util.List;

class Fruit{
	String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	@Override
	 public boolean equals(Object obj) {
		Fruit f = (Fruit) obj;
	    return this.name.equals(f.name);
	 }
	
	
}

public class SortDemo {

	public static void main(String[] args) {
		
		
		List<Fruit> fruits = new ArrayList<>();
	
		fruits.add(new Fruit("mango"));
		fruits.add(new Fruit("grape"));
		fruits.add(new Fruit("apple"));
		
		System.out.println(fruits);
		
//		Collections.sort(fruits);
		System.out.println(new Fruit("apple").equals(new Fruit("apple")));
		System.out.println(fruits.contains(new Fruit("apple")));

	}

}
