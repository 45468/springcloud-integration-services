package com.xiwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ScisIntegralServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScisIntegralServiceApplication.class, args);
	}

}

