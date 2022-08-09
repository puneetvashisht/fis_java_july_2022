package com.fis.first_jaxrs.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.fis.first_jaxrs.model.Student;

public class StudentService implements IStudentService{
	
	static Map<Long, Student> studentMap = new HashMap<>();
	
	static {
		studentMap.put(1l, new Student(1l, "Ravi", "CS", "2018"));
		studentMap.put(12l, new Student(12l, "Ankit", "IT", "2019"));
	}
	
	public Collection<Student> fetchAllStudents() {
		return studentMap.values();
	}
	
	public void addStudent(Student student) {
		studentMap.put(student.getId(), student);
	}

}
