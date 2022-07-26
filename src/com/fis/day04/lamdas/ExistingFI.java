package com.fis.day04.lamdas;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class ExistingFI {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> consumer = (x, y) -> System.out.println(x/y);
		consumer.accept(8, 2);
		
		
		Function<String, String> function = (x) -> x.substring(1,3);
		String result = function.apply("abcdef");
		System.out.println(result);
		
		

	}

}
