package com.canguro.challenge.got;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GotApplication {

	public static void main(String[] args) {
		SpringApplication.run(GotApplication.class, args);
	}

}
