package com.fis.springbootadv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
    public Docket postsApi() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("Product API")
                .description("Product REST API documentation")
                .version("1.0")
                .build();

        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo).pathMapping("/").select()
				.paths(regex("/posts.*")).build();
    }
}
