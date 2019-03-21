package com.local.ysf.ReaderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableEurekaClient
@SpringBootApplication(scanBasePackages="com.local.ysf.ReaderService.*")
@EnableFeignClients("com.local.ysf.ReaderService.exposition.external")
@EnableCircuitBreaker
public class ReaderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReaderServiceApplication.class, args);
	}
}
