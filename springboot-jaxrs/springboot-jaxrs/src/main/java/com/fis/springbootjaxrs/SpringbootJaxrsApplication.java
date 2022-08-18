package com.fis.springbootjaxrs;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootJaxrsApplication {
	
	@Bean
	ResourceConfig resourceConfig() {
		return new ResourceConfig().register(TestResource.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJaxrsApplication.class, args);
	}

}
