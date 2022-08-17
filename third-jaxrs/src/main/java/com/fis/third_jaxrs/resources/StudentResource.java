package com.fis.third_jaxrs.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/students")
public class StudentResource {
	
	@GET
	@Produces("text/plain")
	public String getStudents() {
		return "student resource";
	}

}
