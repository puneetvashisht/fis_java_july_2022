package com.fis.springbootjaxrs;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;


@Path("/courses")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class CourseResource {
	
	@Autowired
	CourseRepository courseRepository;
	
	@GET
	public List<Course> getCourses() {
		return courseRepository.findAll();
	}
	
	@Path("{id}")
	@GET
	public Response getCourse(@PathParam("id") int id) {
		Optional<Course> courseFound = courseRepository.findById(id);
		if(courseFound.isPresent()) {
			Course course =  courseFound.get();
			return Response.ok(course).build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}
	
	@Path("{id}")
	@DELETE
	public Response deleteCourse(@PathParam("id") int id) {
		try {
			courseRepository.deleteById(id);
			return Response.status(Status.NO_CONTENT).build();
		}
		catch(EmptyResultDataAccessException e) {
			return Response.status(Status.NOT_FOUND).build();
		}
		
	}
	
	@Path("/by")
	@GET
	public Response getCourseByName(@QueryParam("title") String title) {
		System.out.println(title);
		Course course = courseRepository.findByTitle(title);
		if(course == null) {
			return Response.status(Status.NOT_FOUND).build();
		}
		return Response.ok(course).build();
	}
	
	@POST
	public Response addCourse(Course course) {
		System.out.println(course);
		// check if title exists
		Course foundCourse = courseRepository.findByTitle(course.getTitle());
		if(foundCourse == null) {
			courseRepository.save(course);
			return Response.status(Status.CREATED).build();
		}
		return Response.status(Status.CONFLICT).build();
		
	}
	@PUT
	public void updateCourse(Course newCourse) {
		courseRepository.save(newCourse);
	}
	
	

}
