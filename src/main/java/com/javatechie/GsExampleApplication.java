package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsExampleApplication.class, args);
	}

}
