package com.fis.day04;

public class StringDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
//		String str = "";
		StringBuilder str = new StringBuilder("");
		
		for(int i=0;i<10000000;i++) {
			Thread.sleep(200);
//			str += i;
			str.append(i);
		}
		
		System.out.println(str.toString());

	}

}
