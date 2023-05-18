package com.example.Admin_Client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AdminClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminClientApplication.class, args);
	}

}
