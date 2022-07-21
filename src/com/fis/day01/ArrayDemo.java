package com.fis.day01;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
//		int scores[] = new int[10];
//		
//		scores[0] = 23;
//		scores[4] = 34;
//		scores[9] = 34;
		
		int scores[] = {3,343,34,3,44,44,433,43,76};
		
		Arrays.sort(scores);
		System.out.println("Max score is " + scores[scores.length-1]);

		
//		System.out.println(scores.);
		
		
//		for(int i=0; i<= scores.length ; i++) {
//			System.out.println(scores[i]);
//		}
		
		System.out.println("Length is: " + scores.length);
		
		for(int score: scores) {
			System.out.println(score);
		}
		

	}

}
