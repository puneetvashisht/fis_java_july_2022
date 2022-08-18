package com.fis.springbootjaxrs;

import javax.ws.rs.CookieParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

@Path("/test")
public class TestResource {


//	@POST
//	public Response addCourse(@FormParam("name") String name, @FormParam("password") String password) {
//		System.out.println("param value :" + name);
//		System.out.println("param value :" + password);
//		return Response.status(Status.OK).build();	
//	}
//	
	@GET
	public Response addCourse(@DefaultValue("abcd as default") @QueryParam("name") String name, @CookieParam("color") Cookie cookie) {
		
		System.out.println(cookie.getValue());
		System.out.println("param value :" + name);
//		System.out.println("param value :" + password);
//		return Response.status(Status.OK).build();
		return Response
                .ok()
                .cookie(new NewCookie("name", "new-value"))
                .build();
	}
}
