package com.fis.first_jaxrs.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	private Long id;
	private String name;
	private String course;
	private String year;
	public Student() {
		
	}
	public Student(Long id, String name, String course, String year) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.year = year;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", year=" + year + "]";
	}
	
	
	

}
