package com.fis.day04;

public class StringDemo {
	
	public static void main(String[] args) {
		String str = "Good cloudy morning..";
		String str2 = "Good cloudy morning..";
		String newStr = str.substring(0, 4);
		
		System.out.println(str);
		System.out.println(newStr);
		
		
		System.out.println(str == str2);
		
		
	}

}
