package com.example.eurekhserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekhserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekhserverApplication.class, args);
	}

}
