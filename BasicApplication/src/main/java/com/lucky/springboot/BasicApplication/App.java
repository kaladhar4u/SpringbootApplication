package com.lucky.springboot.BasicApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world! using SpringBoot
 *
 */
@SpringBootApplication
@ComponentScan("com.lucky.springboot.Controller")
public class App extends SpringBootServletInitializer
{
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(App.class);
	    }

	
	 public static void main( String[] args ) 
	    {
	        SpringApplication.run(App.class, args);
	    }
}
