package com.local.ysf.ReaderService.exposition.swagger;

import java.util.Collection;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ReaderServiceSwaggerConfiguration {

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.local.ysf.ReaderService.exposition"))
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("Readers Microservice Api",
				"this microservice is used to Manage Books by adding / modify / delete / read / show    ", // description
				"1.0", "Terms of service", new Contact("yousef rossamy ", "Mail", "youssef.rossamy@gmail.com"),
				"License of API", "API license URL", Collections.emptyList());
	};

}