package com.fis.springbootjaxrs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

@Path("/courses")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class CourseResource {
	
	@Autowired
	CourseRepository courseRepository;
	
	@GET
	public List<Course> getCourses() {
//		List<Course> courses = new ArrayList<>();
//		courses.add(new Course(23, "Angular", 5000));
//		courses.add(new Course(13, "React", 5000));
		
		return courseRepository.findAll();
//		return courses;
	}
	
	@POST
	public void addCourse(Course course) {
		System.out.println(course);
		courseRepository.save(course);
	}

}
