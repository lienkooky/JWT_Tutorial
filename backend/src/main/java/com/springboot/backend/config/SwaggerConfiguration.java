package com.springboot.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author lien
 * @version 1.0.0
 */
@Configuration
public class SwaggerConfiguration {


    @Bean
    Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
			    .useDefaultResponseMessages(false)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.springboot.backend"))
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("LienKooky Open API Test with Swagger")
				.description("실험 부분")
				.version("1.0")
				.build();
	}
	
}
