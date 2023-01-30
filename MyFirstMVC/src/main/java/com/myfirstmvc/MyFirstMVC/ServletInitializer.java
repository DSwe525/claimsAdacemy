package com.myfirstmvc.MyFirstMVC;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	// DO NOT TOUCH THIS FILE EVER IN THE WORLD TOO
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyFirstMvcApplication.class);
	}

}
