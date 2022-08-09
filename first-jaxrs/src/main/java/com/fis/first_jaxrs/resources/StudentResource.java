package com.fis.first_jaxrs.resources;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fis.first_jaxrs.model.Student;
import com.fis.first_jaxrs.services.IStudentService;
import com.fis.first_jaxrs.services.StudentJdbcService;

@Path("/students")
public class StudentResource {
	
	IStudentService studentService = new StudentJdbcService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Student> fetchAllStudents(){
		return studentService.fetchAllStudents();
	}
	
	@POST
	public Student addStudent(Student student){
		studentService.addStudent(student);
		return student;
	}

}
