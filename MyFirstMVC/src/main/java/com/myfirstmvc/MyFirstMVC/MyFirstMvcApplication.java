package com.myfirstmvc.MyFirstMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

// ComponentScan lets all of the beans in the project seen by the main
@ComponentScan(basePackages = "com.myfirstmvc")
public class MyFirstMvcApplication {

	// DO NOT TOUCH THE MAIN EVER IN THE WORLD, NOT GOOD
	public static void main(String[] args) {
		SpringApplication.run(MyFirstMvcApplication.class, args);
	}

}
