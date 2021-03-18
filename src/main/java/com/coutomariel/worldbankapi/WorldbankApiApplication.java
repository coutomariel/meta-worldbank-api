package com.coutomariel.worldbankapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WorldbankApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldbankApiApplication.class, args);
	}

}
