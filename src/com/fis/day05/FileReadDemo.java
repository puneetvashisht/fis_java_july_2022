package com.fis.day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\work\\eclipse-workspace\\basics\\src\\abc.txt");
			int c = 0;
			while((c = fis.read()) != -1 ) {
				System.out.println((char)c);
				
			}
			fis.close();
		} catch (FileNotFoundException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
