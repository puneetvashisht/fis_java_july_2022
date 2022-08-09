package com.fis.first_jaxrs.services;

import java.util.Collection;

import com.fis.first_jaxrs.model.Student;

public interface IStudentService {
	public Collection<Student> fetchAllStudents();
	public void addStudent(Student student);
}
