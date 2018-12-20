package com.xiwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ScisOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScisOrderServiceApplication.class, args);
	}

}

