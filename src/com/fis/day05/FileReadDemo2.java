package com.fis.day05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo2 {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("D:\\work\\eclipse-workspace\\basics\\src\\abc.txt"));
			String line = reader.readLine();
			System.out.println(line);
			reader.close();
//			
//			int c = 0;
//			while((c = reader.read()) != -1 ) {
//				System.out.println(c);
//				
//			}
//			reader.close();
		} catch (FileNotFoundException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
