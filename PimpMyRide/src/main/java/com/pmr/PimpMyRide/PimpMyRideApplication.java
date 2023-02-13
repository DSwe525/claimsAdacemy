package com.pmr.PimpMyRide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pmr")
public class PimpMyRideApplication {

	public static void main(String[] args) {
		SpringApplication.run(PimpMyRideApplication.class, args);
	}

}
