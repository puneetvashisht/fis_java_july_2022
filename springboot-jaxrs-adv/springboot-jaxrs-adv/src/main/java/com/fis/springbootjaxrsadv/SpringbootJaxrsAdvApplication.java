package com.fis.springbootjaxrsadv;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fis.springbootjaxrsadv.resources.PostResource;

@SpringBootApplication
public class SpringbootJaxrsAdvApplication {

	@Bean
	ResourceConfig resourceConfig() {
		return new ResourceConfig().register(PostResource.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJaxrsAdvApplication.class, args);
	}

}
