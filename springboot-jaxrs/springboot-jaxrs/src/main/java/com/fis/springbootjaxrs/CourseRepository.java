package com.fis.springbootjaxrs;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer>{
	
	public Course findByTitle(String title);

}
