package com.fis.day03;

import java.util.LinkedList;
import java.util.List;

import com.fis.day02.Employee;
import com.fis.day02.RegularEmployee;

public class ArrayListDemo {

	public static void main(String[] args) {
//		int arr[] = {2,3,4};
//		arr[4]= 34;
//		System.out.println(arr[5]);
		
		List<Employee> list = new LinkedList<>();
//		list.add(3);
//		list.add(44);
		
		list.add(new RegularEmployee(12, "RE1", 40000));
		
//		for(Object i : list) {
//			System.out.println((Integer)i);
//		}
		
		for(Employee e : list) {
			System.out.println(e);
		}
		
		System.out.println(list);

	}

}
